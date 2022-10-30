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
public class Extras {
    
    private String tipoExtra;

    boolean exit;

    public void correrMenu() {


            imprimirMenu();
            int eleccion = getInput();
            tomarAccion(eleccion);
        

    }

    public void imprimirMenu() {
        JOptionPane.showMessageDialog(null, """
                                            Elija tipo de Cuarto: 
                                             1) Hot Toys
                                             2) Escort
                                             3) Alchol
                                             4) Birra
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
                tipoExtra= "Hot Toys";
                break;
            case 2:
                tipoExtra= "Escort";
                break;
            case 3:
                tipoExtra= "Alchol";
                break;
            case 4:
                tipoExtra= "Birra";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
               
        }
        
        
    }

    public String getTipoExtra() {
        return tipoExtra;
    }

    public void setTipoCuarto(String tipoCuarto) {
        this.tipoExtra = tipoExtra;
    }

    
}
