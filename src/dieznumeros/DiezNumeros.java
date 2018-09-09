/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieznumeros;

//Importo paquete java.util para poder utilizar la clase Scanner
import java.util.*;

/**
 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 *
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

        int sueldos = 0;

        int sumaSueldos = 0;

        int contador = 0;
        
        

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce los sueldos");

            sueldos = entrada.nextInt();

            sumaSueldos = sueldos + sumaSueldos;

            
            // Si el sueldo es superior a 1000€ aumentamos el contador en 1
            if (sueldos > 1000) {

                contador++;

            }

        }
        //Imprimimos por pantalla el número de empleados que ganan mas de 1000€ y la suma de sus sueldos
        System.out.println("Hay " + contador + " empleados que ganan mas de 1000€ y  la suma de todos los sueldos son " + sumaSueldos + " euros.");

    }

}
