/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package jiun.evaluacion;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Evaluacion {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Hotel el Pecado");

        Cliente cliente1 = new Cliente();

        cliente1.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        cliente1.setApellidos(JOptionPane.showInputDialog("Digite su apellido"));
        cliente1.setCedula(JOptionPane.showInputDialog("Digite su cedula"));
        cliente1.setTelefono(JOptionPane.showInputDialog("Digite su telefono"));

        Cuarto cuarto1 = new Cuarto();
        cuarto1.correrMenu();
        
        Reserva reserva1 = new Reserva();
        reserva1.setFechaDeReserva(JOptionPane.showInputDialog("Digite su fecha de reserva"));
        
        Extras extra1 = new Extras();
        extra1.correrMenu();
        
     

        JOptionPane.showMessageDialog(null, "Nombre de Cliente: " + cliente1.getNombre()
                + "\nCuarto Elegido: "+cuarto1.getTipoCuarto()+"\nFecha de Reserva es: "+reserva1.getFechaDeReserva()+
                "\nExtra elegido: "+extra1.getTipoExtra());

    }
}
