package com.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.modelos.Cliente;
import com.examen2.examen2.servicios.ClienteServicio;
import com.examen2.examen2.servicios.PrestamoServicio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServicio clienteServicio;

    // @Autowired
    // private PrestamoServicio prestamoServicio;

    @PostMapping("/crear/cliente")
    public Cliente crearCliente(@RequestBody Cliente newCliente) {
        return this.clienteServicio.crearNuevoCliente(newCliente);
    }
    

}
