import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        crearFigura();
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
        }

        if (respuestaUsuario == 2){
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("EL area total es: " + cuadrado.calcularArea());
        }
        if (respuestaUsuario == 3) {
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("EL area total es: " + triangulo.calcularArea());
        }
    }
}