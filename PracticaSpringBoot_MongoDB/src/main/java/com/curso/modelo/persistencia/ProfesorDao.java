package com.curso.modelo.persistencia;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.curso.modelo.entidad.Profesor;

public interface ProfesorDao extends MongoRepository<Profesor, Integer>{

}

