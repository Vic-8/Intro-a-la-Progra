/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Rutinas.llenarArreglo();
        //Rutinas.mostrarArreglo();
        //Rutinas.numVendedor();
        //ARREGLOS MULTIDIMENSIONALES
        //Crear y llenar matriz
        /* int goles [] [] = new int [4][3];
        
        //llenando la matriz
        
        for (int i = 0; i < 4; i++) { //recorrido de las filas, se llena de izq a derecha, for anidado necesario
            for (int j = 0; j < 3; j++) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite los goles"));
                goles[i][j] = valor;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("La cantidad de goles es de "+goles[i][j]);
            }
            
        }
         */
        //Ejercicio de Matriz
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de N"));

        int matriz[][] = new int[valor][valor];

        for (int i = 0; i < valor; i++) {

            for (int j = 0; j < valor; j++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                matriz[i][j] = numero;
            }
        }
        //variable para calculo de diagonal e diagonal inversa
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //diagonal
                if (i == j) {
                    suma1 = suma1 + matriz[i][j];
                }
                //diagonal inversa
                if (i + j == matriz.length - 1) {
                    suma2 = suma2 + matriz[i][j];
                }
            }
        }
        
        System.out.println(suma1);

        
        
        
    }

}
