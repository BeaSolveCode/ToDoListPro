package Proyectos.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import Proyectos.Entities.Tarea;

public interface TareaRepository extends MongoRepository<Tarea,String>{


	List<Tarea> findAll();
	

}
