package dev.java10x.api.repository;

import dev.java10x.api.dto.AlunoResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<AlunoResponse, Long> {

}
