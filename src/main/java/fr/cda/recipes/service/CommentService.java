package fr.cda.recipes.service;

import fr.cda.recipes.dto.CommentDTO;
import fr.cda.recipes.entity.Comment;
import fr.cda.recipes.entity.embedded.UserRecipeId;
import fr.cda.recipes.repository.CommentRepository;
import fr.cda.recipes.repository.RecipeRepository;
import fr.cda.recipes.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentRepository commentRepository;

    public Comment handleSave(CommentDTO dto) {
        Comment comment = new Comment();
        comment.setCreatedAt(LocalDateTime.now());
        comment.setRating(dto.getRating());
        comment.setContent(dto.getContent());
        comment.setId(new UserRecipeId(dto.getRecipeUuid(), dto.getUserUuid()));
        return commentRepository.saveAndFlush(comment);
    }

    public Comment delete(UserRecipeId dto) {
        Comment comment = commentRepository.findById(
                new UserRecipeId(dto.getRecipeUuid(), dto.getUserUuid())).get();
        comment.setContent("Message supprimé");
        comment.setDeletedAt(LocalDateTime.now());
        return commentRepository.saveAndFlush(comment);
    }
}
