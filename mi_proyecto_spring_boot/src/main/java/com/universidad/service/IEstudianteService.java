package com.universidad.service;

import java.util.List;

import com.universidad.dto.EstudianteDTO;

public interface IEstudianteService { // Define la interfaz IEstudianteService7
    
    List<EstudianteDTO> obtenerTodosLosEstudiantes(); // Método para obtener una lista de todos los EstudianteDTO

    EstudianteDTO obtenerEstudiantePorId(Long id);
    
    EstudianteDTO actualizarEstudiantePorId(Long id, EstudianteDTO estudianteDTO);

    EstudianteDTO agregarEstudiante(EstudianteDTO estudianteDTO);

    void eliminarEstudiantePorId(Long id);
    
}


