package fr.cda.recipes.controller_rest;

import fr.cda.recipes.entity.Favorite;
import fr.cda.recipes.entity.embedded.UserRecipeId;
import fr.cda.recipes.service.FavoriteService;
import lombok.AllArgsConstructor;
import net.datafaker.providers.base.Bool;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/favorite")
public class FavoriteRestController {

    private FavoriteService favoriteService;

    @PostMapping
    public Boolean handleFavorite(@RequestBody UserRecipeId data) {
        return favoriteService.handleFavorite(data);
    }

}