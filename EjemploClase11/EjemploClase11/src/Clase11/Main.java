/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

/**
 * 
 * AUTOR:
 * Ing: Jose Daniel Matamoros Quesada
 */

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    
        /*Quite static*/
    public static void main(String[] args) {
       
      
        
        
        //Inicializar Objetos
        Auto.inicAutos();
        Cliente.iniciaCltes();
        Empleado.iniciaEmp();
        Venta.iniciaVenta();
        Proveedor.iniciaProv();
        Alquiler.iniciaAl();
  
   
        //Menu
        MenuPrin.MenuPrin();
        
       
    }
 }


    

