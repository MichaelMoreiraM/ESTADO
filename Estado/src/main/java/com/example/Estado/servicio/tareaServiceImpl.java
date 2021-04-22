package com.example.Estado.servicio;

import java.util.List;

import com.example.Estado.entidad.tareas;
import com.example.Estado.repositorio.tarearepositorio;

import org.springframework.beans.factory.annotation.Autowired;

public class tareaServiceImpl implements tareaservice {

    @Autowired
    private tarearepositorio repository;

    @Override
    public List<tareas> listatareas() {
        
        return repository.findAll();
    }
    
}
