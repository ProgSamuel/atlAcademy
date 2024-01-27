import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        // Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
        // Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.

        int[] numeros = new int[5];

        int mayor = 0;
        int menor= 0;
        int suma = 0;
        int numero = 0;

        calcular(numero, numeros, mayor, menor, suma);
        out.println("array : ");
        mostrarNumeros(numeros);
    }

    private static void calcular(int numero, int[] numeros, int mayor, int menor, int suma) {
        while (numero < numeros.length){
            int numeroINput = pedirNumero();
            numeros[numero] = numeroINput;

            if (numeroINput >= mayor || numero == 0){
                mayor =numeroINput;
            }
            if (numeroINput <= menor || numero == 0){
                menor =numeroINput;
            }

            suma += numeroINput;

            numero++;

        }
        out.println("El numero mayor es: "+ mayor +" y el numero menor es: "+ menor);
        out.println("El promedio es de: "+ (float) suma / numeros.length);
    }

    private static void mostrarNumeros( int [] numeros){
        int i = 0;
        while (i < numeros.length){
            System.out.print( numeros[i] +" ");
            i++;
        }
    }

    private static int pedirNumero(){
        Scanner teclado = new Scanner(in);
        out.print("Ingrese un numero: ");
        int numeroINput = teclado.nextInt();
        return numeroINput;
    }
}