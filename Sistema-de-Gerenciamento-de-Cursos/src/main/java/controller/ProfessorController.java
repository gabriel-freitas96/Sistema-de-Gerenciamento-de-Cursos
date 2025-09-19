package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Professor;
import service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> listar() {
        return service.listar();
    }

    @PostMapping
    public Professor salvar(@RequestBody Professor professor) {
        return service.salvar(professor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}