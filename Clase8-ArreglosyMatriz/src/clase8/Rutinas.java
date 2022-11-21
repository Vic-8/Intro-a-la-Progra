/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Rutinas {

    //declarar arreglo
    static int arreglo[] = new int[5];

    // Metodo para llenar arreglo
    public static void llenarArreglo() {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));

        }
    }

    //Metodo para leer un arreglo
    public static void mostrarArreglo() {
        String mensaje = "Los valores ingresados son:\n";
        for (int i = 0; i < arreglo.length; i++) {
            mensaje += String.format("valor en %d es %d\n", i + 1, arreglo[i]);
            //+= = mensaje = mensaje + XXXX
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void buscArreglo() {

        int valor = Integer.parseInt(JOptionPane.showInputDialog("digite el valor a buscar"));
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                System.out.println("el valor se encuentra en posicion" + i + 1);
            } else {
                System.out.println("el valor NO se encuentra en posicion" + i + 1);

            }
        }
    }

    public static void numVendedor() {

        int valor = 0;
        int dato = 0;
        int suma = 0;

        while (dato >= 0) {

            dato = Integer.parseInt(JOptionPane.showInputDialog("-1 para salir / 1 para continuar"));
            if (dato == -1) {
                break;
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog("numero de vendedor"));
            suma = suma + arreglo[valor - 1];

        }

        System.out.println("la sumatoria del vendedor es " + suma);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("el vendedor " + (i + 1) + " ha vendido " + arreglo[i]);

        }

    }
    
    
   //ARREGLOS MULTIDIMENSIONALES
    
    

}
