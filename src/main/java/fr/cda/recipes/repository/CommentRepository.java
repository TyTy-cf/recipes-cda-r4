package fr.cda.recipes.repository;

import fr.cda.recipes.entity.Comment;
import fr.cda.recipes.entity.embedded.UserRecipeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UserRecipeId> {

}