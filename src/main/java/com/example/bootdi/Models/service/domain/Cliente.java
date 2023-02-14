package com.example.bootdi.Models.service.domain;



//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
    
  // @Value("${Cliente.nombre}")
    public String nombre="JOSWARD";
  //  @Value("${Cliente.apellido}")
    public String apellido="PULIDO";

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;

    }
    @Override
    public String toString() {
        return "" + getNombre() + " " + getApellido() + "";
    }
  
   
    
    
}
