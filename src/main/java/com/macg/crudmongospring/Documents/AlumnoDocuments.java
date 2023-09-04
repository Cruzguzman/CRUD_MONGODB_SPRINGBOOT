package com.macg.crudmongospring.Documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Alumno")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDocuments {
    @Id
    private long id;
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;

}
