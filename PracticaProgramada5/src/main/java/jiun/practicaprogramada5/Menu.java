/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jiun.practicaprogramada5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Menu {

    Scanner keyboard = new Scanner(System.in);
    Banco banco = new Banco();
    boolean exit;

    public void correrMenu() {

        while (!exit) {
            imprimirMenu();
            int eleccion = getInput();
            tomarAccion(eleccion);
        }

    }

    private void imprimirMenu() {
        JOptionPane.showMessageDialog(null, """
                                            Por favor seleccione una opci\u00f3n: 
                                             1) Crear una cuenta nueva
                                             2) Hacer un dep\u00f3sito
                                             3) Hacer un retiro
                                             4) Saldo Actual
                                             0) Salir""");

    }

    private int getInput() {
        int eleccion = -1;

        do {
           
            try {
                eleccion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción: "));
            } catch (NumberFormatException e) {
                System.out.println("Por favor digite un número válido");
            }

            if (eleccion < 0 || eleccion > 4) {
                System.out.println("Número inválido, seleccione una opción dada");
            }
        } while (eleccion < 0 || eleccion > 4);
        return eleccion;

    }

    public void tomarAccion(int eleccion) {
        switch (eleccion){
        
            case 0:
                JOptionPane.showMessageDialog(null, "Hasta Luego");
                System.exit(0);
                break;
            case 1:
                crearCuenta();
                break;
            case 2:
                hacerDeposito();
                break;
            case 3:
                hacerRetiro();
                break;
            case 4:
                saldoActual();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
        }
    }

    private void crearCuenta() {
        Cuenta crearCuenta = new Cuenta();
        crearCuenta.crearCuenta();
    }

    private void hacerDeposito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void hacerRetiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saldoActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
