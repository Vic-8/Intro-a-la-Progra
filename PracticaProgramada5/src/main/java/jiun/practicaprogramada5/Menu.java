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
                                            Por favor seleccione su cuenta: 
                                             1) Alonso Quijano
                                             2) Fernando Castillo
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
                Alonso();
                break;
            case 2:
              //  Fernando();
                break;
            case 3:
              //  hacerRetiro();
                break;
            case 4:
               // saldoActual();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
        }
    }

    private void Alonso() {

        Cuenta cuenta1 = new Cuenta ();
        cuenta1.cuenta1();
        System.out.println("El saldo es "+cuenta1.saldoActual+"\nNodeCuenta es: "+cuenta1.nodeCuenta);
        
        imprimirMenu2();
        int eleccion = getInput();
        tomarAccion2(eleccion);
 
    }
    
    private void imprimirMenu2() {
        JOptionPane.showMessageDialog(null, """
                                            Por favor seleccione accion a tomar: 
                                             1) Retirar
                                             2) Depositar
                                             3) Monto de interes del mes actual
                                             4) Saldo Actual
                                             0) Salir""");

    }

    public void tomarAccion2(int eleccion) {
        switch (eleccion){
        
            case 0:
                JOptionPane.showMessageDialog(null, "Hasta Luego");
                System.exit(0);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "TESTING");
                break;
            case 2:
              //  Fernando();
                break;
            case 3:
              //  hacerRetiro();
                break;
            case 4:
               // saldoActual();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
                
        }
    }
   
}
