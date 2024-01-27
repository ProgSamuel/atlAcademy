import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        // hacer una funcion que cargue calcule el area de un rectangulo
//        calcularArea();

        // hacer una funcion que genere un password
        generarPassword();
    }

    private static void calcularArea (){
        Scanner teclado = new Scanner(in);

        System.out.println("Ingrese el tamano del ancho: ");
        double ancho = teclado.nextDouble();
        System.out.println("Ingrese el tamano del alto: ");
        double alto = teclado.nextDouble();

        System.out.println("El area es de: " + ancho*alto);
    }

    private static void generarPassword(){
    double password = Math.random()*1000000;
//    String newPassword =
    out.println("Su nueva password: "+ Math.round(password));
    }
}