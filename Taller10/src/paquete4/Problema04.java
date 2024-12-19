/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double [][] datos=new double[2][2];
        double valor;
        int fueraRango=0;
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingrese el valor");
                valor= entrada.nextDouble();
                // < >
                if (valor > 1000 && valor < 1999 ) {
                    datos[fila][col]= valor;
                } else {
                    datos[fila][col]= 10.0;
                    fueraRango=fueraRango+1;
                }
            }
        }
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println(datos[fila][col]);
                
            }
        }
        System.out.printf(" exiten %d datos fura del rango",fueraRango);
        
    }
}
