import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Peso en kg - altura en metros al cuadrado

        Scanner cargaDedatos = new Scanner(System.in);
        System.out.println("Ingrese su peso en KG");
        double peso = cargaDedatos.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = cargaDedatos.nextDouble();
        double indiceMasaCorporal = peso / (altura * altura);

        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal);


        // Mayor a 30 => obesidad
        // Entre 25 y 30 => sobrepeso
        // Entre 18.5 y 25 => normal
        // Menor a 18.5 => debajo del normal
        if (indiceMasaCorporal > 30 ){
            System.out.println("¡Estas en estado de obesidad!");
        } else if (indiceMasaCorporal > 25) {
            System.out.println("¡Estas en estado de sobrepeso!");
        } else if (indiceMasaCorporal > 18.5) {
            System.out.println("¡Estas en estado de normal!");

        } else {
            System.out.println("¡Tu inidce coporal estas abajo del normal!");

        }

    }
}
