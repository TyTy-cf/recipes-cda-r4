package fr.cda.recipes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private int preparationTime;

    @Column(nullable = false)
    private int cookingTime;

    @Column(nullable = false)
    private int calories;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User owner;

    @OneToMany(mappedBy = "recipe")
    private List<Instruction> instructions = new ArrayList<>();

    @OneToMany(mappedBy = "recipe")
    private List<Favorite> favorites = new ArrayList<>();

    @OneToMany(mappedBy = "recipe")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> recipeIngredients = new ArrayList<>();

    public double getAverageRating() {
        if (comments.isEmpty()) return 0d;
        double avg = 0d;
        for (Comment comment: comments) {
            avg += comment.getRating();
        }
        return avg / comments.size();
    }

}
