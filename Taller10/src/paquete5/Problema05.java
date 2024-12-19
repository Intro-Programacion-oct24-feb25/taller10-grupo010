/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena="";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                char letra = estudiantes[fila][col].charAt(0);
                
                if (letra == 'S' || letra == 'P'|| letra =='T') {
                    cadena = String.format("%s%s\n ", cadena,estudiantes[fila][col] );
                }
                
            }
        }
        System.out.printf("%s",cadena);
    }
}
