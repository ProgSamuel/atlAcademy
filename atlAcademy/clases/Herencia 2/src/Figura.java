public abstract class  Figura {
    private String coloFondo;

    public String getColoFondo() {
        return coloFondo;
    }

    public void setColoFondo(String coloFondo) {
        this.coloFondo = coloFondo;
    }

    public abstract double calcularArea();
}
