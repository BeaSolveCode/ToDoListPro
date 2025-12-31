package Proyectos.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data 
@Document(collection = "TodoListPro")
public class Tarea {
    @Id
    private String id;
    private String titulo;
    private String asignatura;
    private String prioridad; // Ej: Alta, Media, Baja
    private boolean completada;
}