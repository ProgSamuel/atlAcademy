import java.io.OptionalDataException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] personas = {
                "Ana Silva",
                "Carlos Santos",
                "Maria Oliveira",
                "João Souza",
                "Julia Pereira",
                "Rafael Silva",
                "Laura Lima",
                "Pedro Rodrigues"
        };

        System.out.println("Engrese su busqueda :");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        for (int i = 0; i < personas.length; i++) {
            String personaEncontrada = personas[i];

            if (personaEncontrada.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("Resultado : " + personaEncontrada);

            }


        }    }


}