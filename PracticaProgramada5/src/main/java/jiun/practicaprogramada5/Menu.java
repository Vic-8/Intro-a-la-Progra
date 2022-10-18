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

    //Scanner keyboard = new Scanner(System.in);
    //Banco banco = new Banco();
    boolean exit;

    public void correrMenu() {

        while (!exit) {
            imprimirMenu();
            int eleccion = getInput();
            tomarAccion(eleccion);
        }

    }

    public void imprimirMenu() {
        JOptionPane.showMessageDialog(null, """
                                            Por favor seleccione su cuenta: 
                                             1) Alonso Quijano
                                             2) Fernando Castillo
                                             0) Salir""");

    }

    public int getInput() {
        int eleccion = -1;

        do {
           
            try {
                eleccion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción: "));
            } catch (NumberFormatException e) {
                System.out.println("Por favor digite un número válido");
            }

            if (eleccion < 0 || eleccion > 2) {
                System.out.println("Número inválido, seleccione una opción dada");
            }
        } while (eleccion < 0 || eleccion > 2);
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
                Fernando();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
        }
    }

    public void Alonso() {

        Cuenta cuenta1 = new Cuenta ();
        cuenta1.cuenta1();
        JOptionPane.showMessageDialog(null,"Titular de Cuenta es: "+cuenta1.nombre+"\nEl saldo es "+cuenta1.saldoActual+
                "\nNumero de Cuenta es: "+cuenta1.nodeCuenta+"\nID de Alonso es: "+cuenta1.iD+
                "\nTasa de Interes en la cuenta es de: "+cuenta1.interes+"%");
        
        JOptionPane.showMessageDialog(null, """
                                            Por favor seleccione accion a tomar: 
                                             1) Retirar
                                             2) Depositar
                                             3) Monto de interes del mes actual
                                             4) Saldo Actual
                                             0) Salir""");
int eleccion = getInput();

        switch (eleccion){
        
            case 0:
                JOptionPane.showMessageDialog(null, "Hasta Luego");
                System.exit(0);
                break;
            case 1:
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un monto a retirar: "));
                        if (cantidad <= cuenta1.saldoActual) {
            cuenta1.saldoActual = cuenta1.saldoActual - cantidad;
            JOptionPane.showMessageDialog(null, "Ud ha retirado: " + cantidad + "\nSu saldo actual es de: " + cuenta1.saldoActual);
        } else {
            System.out.println("No tiene suficiente balance para retirar");
        };
                break;
            case 2:
                
           cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un monto a depositar: "));
              if (cantidad <= 0) {
                  JOptionPane.showMessageDialog(null, "Ud no puede depositar numeros negativos o cero");
        } else {
            cuenta1.saldoActual = cuenta1.saldoActual + cantidad;
            JOptionPane.showMessageDialog(null, "Ud ha depositado: " + cantidad + "\nSu saldo actual es de: " + cuenta1.saldoActual);
                break;
              }
            case 3:
                double intereses;
                intereses = cuenta1.saldoActual*0.02;
                JOptionPane.showMessageDialog(null,"Intereses ganados hasta la fecha son: "+intereses);
                break;
            case 4:
               JOptionPane.showMessageDialog(null,"El Saldo de la Cuenta es: "+cuenta1.saldoActual);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
                
        }
    }

    
public void Fernando(){

        Cuenta cuenta2 = new Cuenta ();
        cuenta2.cuenta2();
        JOptionPane.showMessageDialog(null,"Titular de Cuenta es: "+cuenta2.nombre+"\nEl saldo es "+cuenta2.saldoActual+
                "\nNumero de Cuenta es: "+cuenta2.nodeCuenta+"\nID de Fernando es: "+cuenta2.iD+
                "\nTasa de Interes en la cuenta es de: "+cuenta2.interes+"%");
        
        JOptionPane.showMessageDialog(null, """
                                            Por favor seleccione accion a tomar: 
                                             1) Retirar
                                             2) Depositar
                                             3) Monto de interes del mes actual
                                             4) Saldo Actual
                                             0) Salir""");
int eleccion = getInput();

        switch (eleccion){
        
            case 0:
                JOptionPane.showMessageDialog(null, "Hasta Luego");
                System.exit(0);
                break;
            case 1:
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un monto a retirar: "));
                        if (cantidad <= cuenta2.saldoActual) {
            cuenta2.saldoActual = cuenta2.saldoActual - cantidad;
            JOptionPane.showMessageDialog(null, "Ud ha retirado: " + cantidad + "\nSu saldo actual es de: " + cuenta2.saldoActual);
        } else {
            System.out.println("No tiene suficiente balance para retirar");
        };
                break;
            case 2:
                
           cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un monto a depositar: "));
              if (cantidad <= 0) {
                  JOptionPane.showMessageDialog(null, "Ud no puede depositar numeros negativos o cero");
        } else {
            cuenta2.saldoActual = cuenta2.saldoActual + cantidad;
            JOptionPane.showMessageDialog(null, "Ud ha depositado: " + cantidad + "\nSu saldo actual es de: " + cuenta2.saldoActual);
                break;
              }
            case 3:
                double intereses;
                intereses = cuenta2.saldoActual*0.05;
                JOptionPane.showMessageDialog(null,"Intereses ganados hasta la fecha son: "+intereses);
                break;
            case 4:
               JOptionPane.showMessageDialog(null,"El Saldo de la Cuenta es: "+cuenta2.saldoActual);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        
                
        }

}
        

}
    
