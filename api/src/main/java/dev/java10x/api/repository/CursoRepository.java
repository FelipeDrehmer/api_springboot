package dev.java10x.api.repository;

import dev.java10x.api.dto.CursoResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<CursoResponse, Long> {
}
