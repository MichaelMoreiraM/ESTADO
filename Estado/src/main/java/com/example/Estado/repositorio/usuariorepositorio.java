package com.example.Estado.repositorio;

import com.example.Estado.entidad.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariorepositorio extends JpaRepository<usuario,Integer>{
    
}
