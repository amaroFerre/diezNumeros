/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieznumeros;

//Importo paquete java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 *Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 * @author Amarico
 */
public class DiezNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Creo un nuevo objeto de la clase Scanner
        
        Scanner entrada = new Scanner(System.in);
        
        int sueldos= 0 ;
        
        String nombre ="";
        
        
        int sumaSueldos = 0;
        
        int contador = 0;
        
        
        
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Introduce el nombre de los empleados: ");
            
            nombre = entrada.nextLine();
            
            System.out.println("Introduce los sueldos");
        
        sueldos = entrada.nextInt();
        
        
        
            sumaSueldos = sueldos + sumaSueldos;
            
            if (sueldos >1000){
                
                
                
                contador++;
                
                
            }
        
            
            
        }
        
        System.out.println("Hay " + contador + " personas que ganan mas de 1000 y  la suma de todos los sueldos son "+ sumaSueldos);
        
    }
    
}
