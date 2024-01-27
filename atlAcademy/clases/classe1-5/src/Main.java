import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // carga 3 nmeros y mostarr el mayor y menor

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer numero:");
        Integer numero1 = teclado.nextInt();

        System.out.println("Cargue el segundo numero:");
        Integer numero2 = teclado.nextInt();

        System.out.println("Cargue el tercero numero:");
        Integer numero3 = teclado.nextInt();

        // numero mayor
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mas grande e: " + numero1);
        } else if (numero2 > numero3) {
            System.out.println("El numero mas grande e: " + numero2);
        } else {
            System.out.println("El numero mas grande e: " + numero3);
        }

        //numero menor
        if (numero1 < numero2 && numero1 > numero3){
            System.out.println("El menor numero e: " + numero1);
        } else if (numero2 < numero3) {
            System.out.println("El menor numero e: " + numero2);
        } else {
            System.out.println("El menor numero e: " + numero3);
        }
        // promedio
        float promedio = (numero1 + numero2 + numero3) / 3 ;

        System.out.println("O promedio e: " + promedio);

        // par o impar
        if (numero1 % 2 ==0) {
            System.out.println("El " + numero1 + " e par");
        } else {
            System.out.println("El " + numero1 + " e impar");
        }
        if (numero2 % 2 ==0) {
            System.out.println("El " + numero2 + " e par");
        } else {
            System.out.println("El " + numero2 + " e impar");
        }
        if (numero3 % 2 ==0) {
            System.out.println("El " + numero3 + " e par");
        } else {
            System.out.println("El " + numero3 + " e impar");
        }
    }
}
