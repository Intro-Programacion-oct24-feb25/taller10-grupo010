/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double[][] notas = {{9, 10, 7, 8}, 
                            {10, 5, 7, 9}, 
                            {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] sumaNotas = new double[3];
        double[] promedios = new double[3];
       
        double suma;
        String reporte = "";
        
        for (int i = 0; i < notas.length; i++) { 
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j];
                     
            }
            sumaNotas[i] = suma; // < >
            double promedio= suma/notas[i].length;
            promedios[i]=promedio;
        }
        
        // Presentación de resultados
        for (int i = 0; i < estudiantes.length; i++) {
            reporte = String.format("%sEstudiante: %s tiene un promedio de %.2f\n",
                    reporte,
                    estudiantes[i],
                    promedios[i]);
        }
        
        System.out.printf("%s\n", reporte);
        
    }
}

