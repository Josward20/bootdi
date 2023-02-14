package com.example.bootdi;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//import com.example.bootdi.Models.service.Servicio;
import com.example.bootdi.Models.service.domain.ItemFactura;
import com.example.bootdi.Models.service.domain.Producto;

@Configuration
public class AppConfig {
    


@Primary
 @Bean
 public List<ItemFactura> registrarItemFacturasacturas(){
 Producto producto1 = new Producto("Camara Soni", 15);
 Producto producto2 = new Producto("Telefono THAY", 100);

 ItemFactura linea1= new ItemFactura(producto1, 2);
 ItemFactura linea2= new ItemFactura(producto2, 2);
 return Arrays.asList(linea1,linea2);
 }

}
