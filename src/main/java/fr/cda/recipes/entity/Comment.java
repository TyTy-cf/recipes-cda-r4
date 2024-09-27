package fr.cda.recipes.entity;

import fr.cda.recipes.entity.embedded.UserRecipeId;
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
public class Comment {

    @EmbeddedId
    private UserRecipeId id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private double rating = 0.0;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "recipe_uuid", updatable = false, insertable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "user_uuid", updatable = false, insertable = false)
    private User user;

}
