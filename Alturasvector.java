package com.mycompany.alturasvector;

import java.util.Scanner;

public class Alturasvector {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double[] altura = new double[10];
        double suma= 0;
        
        for (int i = 0; i < altura.length ; i++) {
            System.out.println("ingresar altura "+(i+1)+": ");
            altura[i]= sc.nextDouble();
            
            suma += altura[i];
        }
    
double promedio= suma/ altura.length;
        
        
        int altos=0;
        int bajos=0;
        
        for (int i = 0; i < altura.length ; i++) {
            if (altura[i]>promedio){
                altos= altos+1;
            }
            else{
                bajos= bajos+1;
            }
        }
        
        System.out.println("el promedio de estatura es: "+promedio);
        System.out.println(altos+" son mas altas que el promedio");
        System.out.println(bajos+" son mas bajas que el promedio");
    }
}
