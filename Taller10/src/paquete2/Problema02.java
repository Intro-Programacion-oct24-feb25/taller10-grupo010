/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String [] vendedores= {"Jessica Cole", "Robert Wallace"};
        int [][] ventas = new int[2][5];
        int suma=0;
        int valor;
        
        for (int fila = 0; fila < ventas.length ;fila++) {
            System.out.printf("Ingres las ventas de %s\n",vendedores[fila]);
            for (int col = 0; col < ventas[fila].length; col++) {
                System.out.println("Ingrese la venta del dia ");
                valor= entrada.nextInt();
                ventas[fila][col]=valor;
                suma= suma+ventas[fila][col];
            }
        }
        System.out.printf(" Vendedor (a) %s \nVendedor (a) %s\nHa realizado un "
                + "total de %d en ventas\n ",
                vendedores[0],
                vendedores[1],
                suma);
        
    }
}
