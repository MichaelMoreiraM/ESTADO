package com.example.Estado.servicio;

import com.example.Estado.entidad.usuario;
import com.example.Estado.repositorio.usuariorepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class usuarioServiceImpl implements usuarioService{
    @Autowired
    private usuariorepositorio Repository;

    @Override
    public usuario insertarusuario(usuario obj) {
       
        return Repository.save(obj);
    }
    
}
