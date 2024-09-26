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
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Type type;

    @ManyToOne
    @JoinColumn(nullable = false)
    private EatingHabit eatingHabit;

}
