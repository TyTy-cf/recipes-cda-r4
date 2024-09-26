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
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int divisor;

    @ManyToOne
    private Unit defaultUnit;

    @OneToMany(mappedBy = "defaultUnit")
    private List<Unit> linkedUnits = new ArrayList<>();

}
