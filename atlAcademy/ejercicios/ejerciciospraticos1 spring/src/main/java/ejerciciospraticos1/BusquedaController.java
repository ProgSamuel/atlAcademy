package ejerciciospraticos1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompetar(@PathVariable String busqueda) {
        int contador = 0;

        String[] frasesTipicasDeBusqueda = {"bootcamp de java", "bootcamp de python", "curso de nodejs", "curso de C", "bootcamp avanzado de java"};
        String[] resultadoDeLaBusqueda = new String[10];

        for (String frase : frasesTipicasDeBusqueda) {
            if (frase.toLowerCase().contains(busqueda.toLowerCase())) {
                 resultadoDeLaBusqueda[contador] = frase;
                 contador++;
            } ;
        };
        return resultadoDeLaBusqueda;
    };

}
