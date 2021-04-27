package com.example.Estado.repositorio;

import com.example.Estado.entidad.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface estadorepositorio extends JpaRepository<Estado,Integer> {
    
}
