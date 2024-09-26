package fr.cda.recipes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class EatingHabit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean isVegan = false;

    @Column(nullable = false)
    private boolean isVegetarian = false;

    @Column(nullable = false)
    private boolean isGlutenFree = false;

    @Column(nullable = false)
    private boolean isFish = false;

    @Column(nullable = false)
    private boolean isPorkLess = false;

    @Column(nullable = false)
    private boolean hasAlcohol = false;

}
