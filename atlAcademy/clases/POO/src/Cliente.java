public class Cliente {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Cliente(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre completo: "+ nombre + " "+ apellido);
        System.out.println("Edad: " + edad);
    };

    public String getNombre(){
        return nombre;
    }

    public String setNombre(String newNombre){
        return this.nombre = newNombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String setApellido (String newApellido){
        return this.apellido = newApellido;
    }

    public Integer getEdad(){
        return edad;
    }

    public Integer setEdad(Integer newEdad){
        return this.edad = newEdad;
    }

}
