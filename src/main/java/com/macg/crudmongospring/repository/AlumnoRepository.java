package com.macg.crudmongospring.repository;

import com.macg.crudmongospring.Documents.AlumnoDocuments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends MongoRepository<AlumnoDocuments, Long> {
}
