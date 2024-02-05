import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    protected  double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    Scanner teclado = new Scanner(System.in);

    public void cargarDatos() {
        System.out.println("Ingresa la altura en cm:");
        double altura = teclado.nextDouble();
        System.out.println("Ingresa la base en cm:");
        double base = teclado.nextDouble();
    }

    public abstract double calcularArea();

}
