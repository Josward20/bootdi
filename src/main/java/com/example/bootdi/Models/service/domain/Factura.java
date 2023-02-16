package com.example.bootdi.Models.service.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {
    // @Value("${Factura.descripcion}")
    public String descripcion = "Comprobante de entrega, Se aceptan devoluciones luego de los 3 meses ";
    

Cliente cliente2=new Cliente();
    @Autowired
    public Cliente cliente=cliente2;
    
    @Autowired
    public List<ItemFactura> items;

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

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }



}
