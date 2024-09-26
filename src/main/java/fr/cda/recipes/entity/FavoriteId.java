package fr.cda.recipes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FavoriteId implements Serializable {

    @Column(name = "recipe_id")
    private String recipeId;

    @Column(name = "user_id")
    private String userId;

}
