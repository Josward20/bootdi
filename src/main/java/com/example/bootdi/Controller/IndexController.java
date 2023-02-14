package com.example.bootdi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.bootdi.Models.service.Servicio;


@Controller
public class IndexController {
    
@Autowired
private Servicio ser;


/* Inyeccion por el constructor
@Autowired
public IndexController(Servicio ser) {
    this.ser = ser;
}
*/


@GetMapping({"/index","/",""})
public String index(ModelMap model){
model.addAttribute("objeto",ser.nombre());
model.addAttribute("objeto2",ser.getObjeto());
return "index";
}


/* Inyeccion por metodo setter
@Autowired
public void setSer(Servicio ser) {
    this.ser = ser;
}
*/






}
