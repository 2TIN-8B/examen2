package com.examen2.examen2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.modelos.Cliente;
import com.examen2.examen2.modelos.Prestamo;
import com.examen2.examen2.repositorios.ClienteRepositorio;
import com.examen2.examen2.repositorios.PrestamoRepositorio;

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    // @Autowired
    // private PrestamoRepositorio prestamoRepositorio;

    public Cliente crearNuevoCliente(Cliente newCliente){
        if (this.clienteRepositorio.existsById(newCliente.getDni())){
            return null;
        }
        List<Prestamo> prestamo = newCliente.getPrestamo();
        if (prestamo != null) {
            // prestamo.List(newCliente);
            for(Prestamo pres:prestamo){
                pres.setCliente(newCliente);
            }
        }
        return this.clienteRepositorio.save(newCliente);
    }

}
