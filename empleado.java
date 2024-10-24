
package ejercicio;

import java.util.Scanner;

public class empleado {
    String nombre, apellido, cargo;
    int identificacion; 

    public empleado(String nombre, String apellido, String cargo, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
}
