package Proyectos.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Proyectos.Entities.Tarea;
import Proyectos.Repository.TareaRepository;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins="*")//para conectar angualar luego
public class TareaRestController {
	@Autowired
	private TareaRepository tareaRepository;
	
	//obtener todas las tareas
	@GetMapping
	public List<Tarea> listar(){
		return tareaRepository.findAll();
	}
	
	//crear una tarea
	@PostMapping
	public Tarea crear(@RequestBody Tarea tarea) {
		return tareaRepository.save(tarea);
	}
	
	//eliminar una tarea 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable String id) {
		tareaRepository.deleteById(id);
	}
}
