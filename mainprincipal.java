package ejercicio;
import ejercicio.empleado;
import java.util.Scanner;

public class mainprincipal  {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String Nombre, Apellido, Cargo;
        int Identificacion;
       
        System.out.println("Ingrese el nombre del empleado: ");
        Nombre= sc.next();
        System.out.println("Ingrese el apellido del empleado: ");
        Apellido= sc.next();
        System.out.println("Ingrese la identificacion del empleado: ");
        Identificacion= sc.nextInt();
        System.out.println("Ingrese el cargo del empleado: ");
        Cargo= sc.next();
        
        empleado objetoempleado= new empleado(Nombre, Apellido, Cargo, Identificacion);
       
        System.out.println("El nombre del empleado es: "+objetoempleado.nombre);
        System.out.println("El apellido del empleado es: "+objetoempleado.apellido);
        System.out.println("La identificacion del empleado es: "+objetoempleado.identificacion);
        System.out.println("El cargo del empleado es: "+objetoempleado.cargo);
        
    }
}
