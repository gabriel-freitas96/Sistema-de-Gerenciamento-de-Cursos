package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
