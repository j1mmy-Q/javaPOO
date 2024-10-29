
package parcial;

import java.util.Scanner;

public class cliente {
    private String nombre;
    private int telefono;
    static int cont= 0;

    public cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        
        ++cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }    
    
    public void ingresarDatosC() {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingresar nombre del cliente "+cont+": ");
        nombre=sc.next();
        System.out.println("Ingresar telefono del cliente "+cont+": ");
        telefono=sc.nextInt();
    }
    public void imprimirDatosC(){
        
        System.out.println("El nombre del cliente "+cont+" es: "+nombre);
        System.out.println("El telefono del cliente "+cont+" es: "+telefono);
    }
}
