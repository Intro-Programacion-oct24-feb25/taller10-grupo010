/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author villa
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};

        double[][] resultado = new double[dato1.length][dato1[0].length];

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                // Elegir el menor valor entre dato1 y dato2 
                if (dato1[fila][col] < dato2[fila][col]) {
                    resultado[fila][col] = dato1[fila][col];
                } else {
                    resultado[fila][col] = dato2[fila][col];
                }
            }
        }

        for (int fila = 0; fila < resultado.length; fila++) {
            for (int col = 0; col < resultado[fila].length; col++) {
                System.out.printf("%.0f\t", resultado[fila][col]);
            }
            System.out.println();
        }
    }

}
