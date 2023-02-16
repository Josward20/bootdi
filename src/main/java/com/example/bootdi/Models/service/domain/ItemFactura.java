package com.example.bootdi.Models.service.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemFactura {
    @Autowired
    private Producto producto;

    private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ItemFactura() {

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
