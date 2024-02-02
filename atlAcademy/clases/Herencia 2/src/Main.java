public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(7);
        double areaTotal1 = circulo1.calcularArea();

        Circulo circulo2 = new Circulo();
        circulo2.setRadio(7);
        areaTotal1 += circulo2.calcularArea();

        System.out.println("Circulo 1, area: " + circulo1.calcularArea());
        System.out.println("Circulo 1, area: " + circulo2.calcularArea());
        System.out.println("la sumatoria de areas es: "+ areaTotal1);
    }
}