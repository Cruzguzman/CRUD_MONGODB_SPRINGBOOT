package com.macg.crudmongospring.service;

import com.macg.crudmongospring.Documents.AlumnoDocuments;
import com.macg.crudmongospring.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoDocuments addAlumnos(AlumnoDocuments alumnoDocuments){

        return alumnoRepository.save(alumnoDocuments);
    }

    public List<AlumnoDocuments> findAllAlumnos(){

        return alumnoRepository.findAll();
    }
    public AlumnoDocuments getById(Long id){

        return alumnoRepository.findById(id).get();

    }
public AlumnoDocuments updateAlumnos(AlumnoDocuments request){

        AlumnoDocuments alumno_update= alumnoRepository.findById(request.getId()).get();
        alumno_update.setNombre(request.getNombre());
        alumno_update.setApellidos(request.getApellidos());
        alumno_update.setEdad(request.getEdad());
        alumno_update.setSexo(request.getSexo());
        return alumnoRepository.save(alumno_update);
    }

    public String deleteAlumnos(long id){
        alumnoRepository.deleteById(id);

        return "Alumno eliminado con ID: " + id;

    }

}
