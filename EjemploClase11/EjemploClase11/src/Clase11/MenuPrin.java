/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase11;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */

public class MenuPrin {
    
     
        
    //METODO CONSTRUCTOR
    public MenuPrin(){
    
    }
    
    public static void MenuPrin(){
        //Instaciar Clases
        //Main ;
        Auto Auto= new Auto();
        Venta Venta= new Venta();
        Alquiler Alquiler= new Alquiler();
        Empleado Empleado = new Empleado();
        Cliente Cliente = new Cliente();
        Proveedor Proveedor = new Proveedor();
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija el menu deseado:\n"
                        + "1 = Empleado.\n"
                        + "2 = Cliente.\n"
                        + "3 = Proveedor.\n"
                        + "4 = Alquiler.\n"
                        + "5 = Venta.\n"
                        + "6 = Auto.\n"
                        + "7 = Salir.\n" ));
        
        switch(opcion){
            case(1):
            {
                Empleado.menuEmpleado();
                MenuPrin.MenuPrin();
                break;
            }
            
            case(2):
            {
                Cliente.menuCliente();
                MenuPrin.MenuPrin();
                break;
            }
            
            case(3):
            {   
                Proveedor.menuProveedor();
                MenuPrin.MenuPrin();
                break;
            }
            
            case(4):
            {
              Alquiler.menuAlquiler();
              MenuPrin.MenuPrin();
                break;
            }
            
            case(5):
            {
               Venta.menuVenta();
               MenuPrin.MenuPrin();
                break;
            }
            
            case(6):
            {
                Auto.menuAuto();
                MenuPrin.MenuPrin();
                break;
            }
            
            case(7):
            {
                System.exit(0);  
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "opcion no valida");
                 MenuPrin.MenuPrin();
            }
        }
    }
}

