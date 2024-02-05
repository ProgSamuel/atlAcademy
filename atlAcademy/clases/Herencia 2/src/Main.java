import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Figura> figuras = new ArrayList<>();
    public static void main(String[] args) {
        boolean mostrarMenu = true;
       do {
           System.out.println("********* MENU *********");
           System.out.println("1) Crear una figura");
           System.out.println("2) Mostrar la sumatoria de areas de las figuras");
           System.out.println("0) Salir");

           Scanner teclado = new Scanner(System.in);
           int respuestaUsuario = teclado.nextInt();
           if (respuestaUsuario == 1) {
               crearFigura();
           }
           if (respuestaUsuario == 2) {
               mostrarSumatoriaFiguras();
           }
           if (respuestaUsuario == 0) {
            mostrarMenu = false;
           }
       } while (mostrarMenu);
    }

    private static void crearFigura() {
        System.out.println("Que figura desea crear?");
        System.out.println("1) Circulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triangulo");

        Scanner teclado = new Scanner(System. in);
        int respuestaUsuario = teclado.nextInt();
        if (respuestaUsuario ==1){
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            System.out.println("EL area total es: " + circulo.calcularArea());
            figuras.add(circulo);
        }

        if (respuestaUsuario == 2){
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("EL area total es: " + cuadrado.calcularArea());
            figuras.add(cuadrado);
        }
        if (respuestaUsuario == 3) {
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("EL area total es: " + triangulo.calcularArea());
            figuras.add(triangulo);
        }
    }

    private static void mostrarSumatoriaFiguras(){
        double sumatoriaAreas = 0;
        for (Figura figura : figuras){
            sumatoriaAreas += figura.calcularArea();

        }
        System.out.println("La sumatoria de areas de todas las figuras es: " + sumatoriaAreas + " cm");

    }
}