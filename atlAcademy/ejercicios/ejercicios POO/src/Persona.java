import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Persona {
    private double id;
    private String nombre;
    private int edad;
    private LocalDate fechaDeNacimento;
    private LocalDateTime fechaCreacion;

    public Persona(String nombre, String nacimento){
        this.id= Math.random()*10000000;
    this.nombre = nombre;
    this.fechaDeNacimento= convertirFecha(nacimento);
    this.edad = calcularEdad();
    this.fechaCreacion = LocalDateTime.now();
    }


    public LocalDate convertirFecha(String value) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fecha = LocalDate.parse(value, formatter);
            return fecha;
        } catch (DateTimeParseException e) {
            System.out.println("Error al convertir la fecha. Formato incorrecto.");
            return null;
        }
    }

    public int calcularEdad(){
        try{
            LocalDate fechaActual = LocalDate.now();
            Period edad = Period.between(this.fechaDeNacimento, fechaActual);
            return edad.getYears();
        } catch (DateTimeParseException e){
            System.out.println("Error al calcular la edad.");
            return 0;
        }

    }
    public void getNombre (){
        System.out.println(this.nombre);
    }


    public void getDatos(){
        System.out.println(
                "Nombre: "+ this.nombre + " edad: " + this.edad + " Fecha de nacimiento: "+
                        this.fechaDeNacimento + " Fecha de creacion: " + fechaCreacion +" y id:" + this.id
        );
    }

    public void esMayor (){
        if (this.edad >= 18){
            System.out.println( this.nombre + " es mayor de edad");
            return;
        }
        System.out.println( this.nombre + " NO es mayor de edad");
    }


}
