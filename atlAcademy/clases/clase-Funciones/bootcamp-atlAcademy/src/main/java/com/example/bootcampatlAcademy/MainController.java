package com.example.bootcampatlAcademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/transformar-a-codigo-morse")

    public String  transformar(){
        return "Hola";
    };


}
