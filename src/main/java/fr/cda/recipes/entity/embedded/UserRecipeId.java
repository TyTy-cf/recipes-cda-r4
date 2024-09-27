package fr.cda.recipes.entity.embedded;

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
public class UserRecipeId implements Serializable {

    @Column(name = "recipe_uuid")
    private String recipeUuid;

    @Column(name = "user_uuid")
    private String userUuid;

}
