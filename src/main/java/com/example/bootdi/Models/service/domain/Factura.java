package com.example.bootdi.Models.service.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {
    // @Value("${Factura.descripcion}")
    public String descripcion = "Factura sin caducidad, cualquier inconveniente comunicarse al siguiente numero";
    
Cliente cliente2=new Cliente();
    @Autowired
    public Cliente cliente=cliente2;
    
    @Autowired
    public List<ItemFactura> iteam;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public List<ItemFactura> getIteam() {
        return iteam;
    }

    public void setIteam(List<ItemFactura> iteam) {
        this.iteam = iteam;
    }

}
