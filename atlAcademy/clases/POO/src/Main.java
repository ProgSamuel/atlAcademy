import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Cliente cliente1 = generarCliente();
    }

    private static Cliente generarCliente(){
        Scanner t = new Scanner(System. in);
        Cliente cliente = new Cliente("sam", "ramos", 22);

//        System.out.print("Ingrese el nombre:");
//        cliente.setNombre(t.nextLine());
//
//        System.out.print("Ingrese el Apellido:");
//        cliente.setApellido(t.nextLine());
//        System.out.print("Ingrese La Edad:");
//        cliente.setEdad(t.nextInt());

        cliente.mostrarDatos();

        return  cliente;
    }
}