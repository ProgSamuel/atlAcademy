public class Circulo {
    private String colorFondo;
    private float radio;

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

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
}
