package service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import model.Professor;
import repository.ProfessorRepository;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    @Autowired
    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> listar() {
        return repository.findAll();
    }

    public Professor salvar(Professor professor) {
        return repository.save(professor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Professor buscarPorId(Long id) {
        return repository.findById(id)
                         .orElseThrow(() -> new RuntimeException("Professor não encontrado com ID: " + id));
    }
}