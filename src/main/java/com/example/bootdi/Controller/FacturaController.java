package com.example.bootdi.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.bootdi.Models.service.domain.Factura;


@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura fact;

  
   
    @GetMapping("/formato")
    public String mostrar(ModelMap model){
model.addAttribute("titulo", "Factura de compra con inyección de dependencia");
 model.addAttribute("factura", fact);
 


 //System.out.print(cli.apellido);
        return "factura/formato";
    }
}
