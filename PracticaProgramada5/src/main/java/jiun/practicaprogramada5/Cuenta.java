/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jiun.practicaprogramada5;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Cuenta {

    public double saldoActual;
    public double nodeCuenta;
    public int iD;
    public double interes = 0.02;
    String nombre;
    public static double numerodeCuentas = 0;

    // Balance en cero
    public void crearCuenta() {

        iD = Integer.parseInt(JOptionPane.showInputDialog("Digite ID de cliente: "));
        nodeCuenta = numerodeCuentas++;
        JOptionPane.showMessageDialog(null, "Su nuevo número de cuenta es: " + numerodeCuentas);
        saldoActual = Double.parseDouble(JOptionPane.showInputDialog("Digite abono a cuenta inicial: "));

    }

    //Cuenta1
    
    public void cuenta1(){
    
        saldoActual = 10000;
        nodeCuenta = 0001;
        iD = 15062155;
        nombre = "Alonso";
        interes = 0.02;

    }
    
        public void cuenta2(){
    
        saldoActual = 25000;
        nodeCuenta = 0002;
        iD = 800842840;
        nombre = "Fernando";
        interes = 0.05;

    }
    
    
    
    // Deposito
    public void deposito(double cantidad) {
        
        if (cantidad < 0) {
            JOptionPane.showMessageDialog(null, "No se puede depositar una cantidad negativa");
        } else {

            saldoActual = saldoActual + cantidad;

            JOptionPane.showMessageDialog(null, "Ud ha depositado: " + cantidad + "\n Su saldo actual es de: " + saldoActual);

        }
    }

    // Retiro
    public void retiro(double cantidad) {

        if (cantidad <= saldoActual) {
            saldoActual = saldoActual - cantidad;
            JOptionPane.showMessageDialog(null, "Ud ha retirado: " + cantidad + "\n Su saldo actual es de: " + saldoActual);
        } else {
            System.out.println("No tiene suficiente balance para retirar");
        }

    }

    // Mostrar Balance
    public double SaldoActual() {

        JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldoActual);
        JOptionPane.showMessageDialog(null, "Su saldo actual con intereses es de: " + saldoActual * interes + "Su tasa de interes es de: " + interes * 100 + "%");
        return saldoActual;

    }

}
