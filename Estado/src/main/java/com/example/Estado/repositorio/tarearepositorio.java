package com.example.Estado.repositorio;

import com.example.Estado.entidad.tareas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface tarearepositorio extends JpaRepository<tareas,Integer>{
    
}
