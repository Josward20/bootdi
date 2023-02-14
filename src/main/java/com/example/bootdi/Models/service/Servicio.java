package com.example.bootdi.Models.service;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Servicio{
    
public String objeto="HOLA COMO ESTAS?";



 public String nombre(){
return "Inicio inyecciones";
 }



public String getObjeto() {
    return objeto;
}



public void setObjeto(String objeto) {
    this.objeto = objeto;
}

}
