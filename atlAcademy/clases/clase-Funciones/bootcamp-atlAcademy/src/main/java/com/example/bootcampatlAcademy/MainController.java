package com.example.bootcampatlAcademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.out;

@RestController
public class MainController {
    @GetMapping("/transformar-a-codigo-morse/{palabra}")

    public static String  transformar(@PathVariable String palabra){
      String cambio = traducir(palabra);
      return cambio;
    };


    private static String traducir( String palabra){
        String[] tablaABC = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] tablaCod = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        String traduccion = "";
        traduccion = getTraduccion(palabra, tablaABC, traduccion, tablaCod);
        return traduccion;
    }

    private static String getTraduccion(String palabra, String[] tablaABC, String traduccion, String[] tablaCod) {
        for (int i = 0; i < palabra.length(); i++){
            String letra = ""+ palabra.charAt(i);
            for (int j = 0; j < tablaABC.length ; j++) {
                if (tablaABC[j].equalsIgnoreCase(letra)){
                    traduccion += " "+ tablaCod[j];
                }
            }
        }
        ;
        return traduccion;
    }


}
