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
    
    public double saldoActual=0;
    public double nodeCuenta;
    public int iD;
    public double interes = 0.02;
    public static double numerodeCuentas = 0;
    
    // Balance en cero
    
    public void crearCuenta(){
        
        iD=Integer.parseInt(JOptionPane.showInputDialog("Digite ID de cliente: "));
        nodeCuenta= numerodeCuentas++;
        JOptionPane.showMessageDialog(null,"Su nuevo número de cuenta es: "+numerodeCuentas);
        saldoActual=Double.parseDouble(JOptionPane.showInputDialog("Digite abono a cuenta inicial: "));
        
    }
    
    // Deposito
    
    public void deposito (double cantidad){
    
    saldoActual = saldoActual + cantidad;
    }
    
    // Retiro
    
    public void retiro (double cantidad){
       
        if (cantidad<=saldoActual) {
             saldoActual = saldoActual - cantidad;
        }
        else{
            System.out.println("No tiene suficiente balance para retirar");
        }
    
    }
    
    // Mostrar Balance
    
    public double SaldoActual(){
    
        JOptionPane.showMessageDialog(null,"Su saldo actual es de: "+saldoActual);
        JOptionPane.showMessageDialog(null,"Su saldo actual con intereses es de: "+saldoActual*interes+"Su tasa de interes es de: "+interes*100+"%");
        return saldoActual;
        
    }
    
    
    
}
