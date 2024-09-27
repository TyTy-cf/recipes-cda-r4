package fr.cda.recipes.service;

import fr.cda.recipes.entity.Favorite;
import fr.cda.recipes.entity.embedded.UserRecipeId;
import fr.cda.recipes.repository.FavoriteRepository;
import fr.cda.recipes.repository.RecipeRepository;
import fr.cda.recipes.repository.UserRepository;
import fr.cda.recipes.service.interfaces.BasicServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FavoriteService {

    private FavoriteRepository favoriteRepository;

    public Boolean handleFavorite(UserRecipeId o) {
        Optional<Favorite> optionalFavorite = favoriteRepository.findById(o);
        if (optionalFavorite.isEmpty()) {
            Favorite favorite = new Favorite();
            favorite.setId(o);
            favorite.setCreatedAt(LocalDateTime.now());
            favoriteRepository.saveAndFlush(favorite);
            return true;
        }
        favoriteRepository.delete(optionalFavorite.get());
        return false;
    }

}
