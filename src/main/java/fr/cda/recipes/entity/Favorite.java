package fr.cda.recipes.entity;

import fr.cda.recipes.entity.embedded.UserRecipeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Favorite {

    @EmbeddedId
    private UserRecipeId id;

    @ManyToOne
    @JoinColumn(name = "recipe_uuid", insertable = false, updatable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "user_uuid", insertable = false, updatable = false)
    private User user;

    @Column(nullable = false)
    private LocalDateTime createdAt;

}
