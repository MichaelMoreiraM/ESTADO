package com.example.Estado.controlador;

import java.util.List;

import com.example.Estado.entidad.Estado;
import com.example.Estado.servicio.estadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class usuariocontroller {
    
    @Autowired
    private estadoService estadoserv;

    @RequestMapping("/")
    public String vercrud(){
        return"crudusuario";
    }
    @RequestMapping("/cargaestado")
    @ResponseBody
    public List<Estado>listaEst(){
        return estadoserv.listaestado(); 
    }
}
