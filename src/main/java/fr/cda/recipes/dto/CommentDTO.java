package fr.cda.recipes.dto;

import fr.cda.recipes.entity.embedded.UserRecipeId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CommentDTO {

    private String userUuid;

    private String recipeUuid;

    private String content;

    private double rating;

}
