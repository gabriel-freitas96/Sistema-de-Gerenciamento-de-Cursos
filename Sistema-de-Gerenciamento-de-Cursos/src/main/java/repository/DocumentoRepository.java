package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}