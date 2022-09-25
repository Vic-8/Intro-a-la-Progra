/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicaprogramada;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class PracticaProgramada {

    public static void main(String[] args) {
                String lectura;
        int numero;

        lectura = JOptionPane.showInputDialog("Digite un numero a evaluar ");
        System.out.println("Ud ha digitado " + lectura);

        try {
            numero = Integer.parseInt(lectura);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe de digitar un numero");
        }
        // Por qué debo de definir otra vez numero como un integer si ya lo hice arriba?
        numero = Integer.parseInt(lectura);
        if (numero % 2 == 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El siguiente numero es par y positivo: " + numero);
            }
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El siguiente numero es par y negativo: " + numero);
            }
        } else if (numero % 2 != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El siguiente numero es Impar y positivo: " + numero);
            }
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El siguiente numero es Impar y negativo: " + numero);
            }
        }
    }
}
