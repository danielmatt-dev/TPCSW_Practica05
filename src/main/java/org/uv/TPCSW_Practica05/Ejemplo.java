package org.uv.TPCSW_Practica05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/url")
public class Ejemplo {

    @GetMapping
    public String saludar() {
        return "Hola mundo";
    }
    
}
