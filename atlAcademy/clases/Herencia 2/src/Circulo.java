import java.util.Scanner;

public class Circulo extends Figura {
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    public double calcularArea() {
        double area = Math.PI * (radio * radio);
        return area;
    }
    Scanner teclado = new Scanner(System.in);

    public void cargarDatos() {
        System.out.println("Ingresa el radio en cm:");
       radio = teclado.nextFloat();

    }
}
