package com.macg.crudmongospring.controller;

import com.macg.crudmongospring.Documents.AlumnoDocuments;
import com.macg.crudmongospring.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AlumnoDocuments addAlumno(@RequestBody AlumnoDocuments alumnoDocuments){

        return alumnoService.addAlumnos(alumnoDocuments);
    }
    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<AlumnoDocuments> getAll(){
        return  alumnoService.findAllAlumnos();
    }
    @GetMapping("/search/{id}")
    public AlumnoDocuments getById(@PathVariable  String id){
        return alumnoService.getById(Long.valueOf(id));
    }
    @PutMapping("/update")
    public AlumnoDocuments updateAlumnos(@RequestBody AlumnoDocuments request){
        return alumnoService.updateAlumnos(request);
    }

    @DeleteMapping("/delete/{id}")
    public  String deletedAlumnos(@PathVariable long id){
        return String.valueOf(alumnoService.deleteAlumnos(id));
    }

}
