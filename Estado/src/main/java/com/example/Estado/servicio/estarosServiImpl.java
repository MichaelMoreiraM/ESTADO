package com.example.Estado.servicio;

import java.util.List;

import com.example.Estado.entidad.Estado;
import com.example.Estado.repositorio.estadorepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estarosServiImpl implements estadoService {

    @Autowired
    private estadorepositorio repository;

    @Override
    public List<Estado> listaestado() {
        
        return repository.findAll();
    }
    
}
