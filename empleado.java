
package parcial;

import java.util.Scanner;

public class empleado {
    private String nombre;
    private int edad;
    private String cargo;
    private double salario;
    private float porcentaje = 0;
    private double salarioInc;
    static int cont=0;

    public empleado(String nombre, int edad, String cargo, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
        ++cont;
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    public void ingresarDatosE(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingresar nombre del del empleado "+cont+": ");
        nombre= sc.next();
        System.out.println("Ingresar la edad del empleado "+cont+": ");
        edad= sc.nextInt();
        System.out.println("Ingresar el cargo del empleado "+cont+": ");
        cargo= sc.next();
        System.out.println("Ingresar el salario del empleado "+cont+": ");
        salario= sc.nextDouble();
        System.out.println("Ingresar el porcentaje de incrementacion "+cont+": ");
        porcentaje=sc.nextFloat();
    }
    
        public void salarioIncrementado(){    
            
            double salarioIncr = (salario * porcentaje) / 100;
            salarioInc = salarioIncr + salario;
        }

    
    public void imprimirDatosE(){
        
        System.out.println("El nombre del empleado "+cont+" es: "+nombre);
        System.out.println("La edad del empleado "+cont+" es: "+edad);
        System.out.println("El cargo del empleado "+cont+" es: "+cargo);
        System.out.println("El salario del empleado "+cont+" es: "+salario);
        System.out.println("El salario incrementado del empleado "+cont+" es: "+salarioInc);
    }
}   

