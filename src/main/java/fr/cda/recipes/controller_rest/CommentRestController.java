package fr.cda.recipes.controller_rest;

import fr.cda.recipes.dto.CommentDTO;
import fr.cda.recipes.entity.Comment;
import fr.cda.recipes.entity.embedded.UserRecipeId;
import fr.cda.recipes.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/comment")
public class CommentRestController {

    private CommentService commentService;

    @PostMapping
    public Comment handleSave(@RequestBody CommentDTO data) {
        return commentService.handleSave(data);
    }

    @DeleteMapping
    public Comment delete(@RequestBody UserRecipeId data) {
        return commentService.delete(data);
    }

}