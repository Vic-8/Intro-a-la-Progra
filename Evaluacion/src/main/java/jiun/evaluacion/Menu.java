/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jiun.evaluacion;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Menu {

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
                                            Elija tipo de Cuarto: 
                                             1) Junior
                                             2) Suite
                                             3) Deluxe
                                             4) Tematica
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

                break;
            case 2:
                Cuarto cuarto1 = new Cuarto();
                break;
            case 3:
                Reserva reserva1 = new Reserva();
                break;
            case 4:
                Extras extra1 = new Extras();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
               
        }
    }

}
