package model;

import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(
        name = "professor_curso",
        joinColumns = @JoinColumn(name = "professor_id"),
        inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private Set<Curso> cursos = new HashSet<>();
}