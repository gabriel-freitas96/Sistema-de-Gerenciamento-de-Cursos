package service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import model.Curso;
import repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository repository;

    @Autowired
    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id)
                         .orElseThrow(() -> new RuntimeException("Curso não encontrado com ID: " + id));
    }
}