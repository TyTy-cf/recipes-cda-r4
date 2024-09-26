package fr.cda.recipes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.datafaker.providers.base.Bool;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Boolean isOptional = false;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Unit unit;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ingredient ingredient;

}
