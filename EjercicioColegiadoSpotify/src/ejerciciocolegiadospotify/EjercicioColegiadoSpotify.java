/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolegiadospotify;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class EjercicioColegiadoSpotify {

    /**
     * @param args the command line arguments
     */
    
    //Spotify requiere crear una clase para controlar la programación de sus canciones,
//para ello requiere los siguientes atributos: Id. de la canción, título, autor, duración
//y año de creación.
//Cree en la clase los atributos correspondientes, el constructor y los métodos encapsuladores.
//Realice los llamados de los getters y setters en el programa .
    
    public static void main(String[] args) {
        
        Canciones cancion1 = new Canciones();
        
        
        cancion1.setTitulo(JOptionPane.showInputDialog("Digite titulo"));
        cancion1.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite ID")));
        cancion1.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Digite Año")));
        cancion1.setDuracion(Double.parseDouble(JOptionPane.showInputDialog("Digite Duracion")));
        
        System.out.println("La cancion ingresada es: "+cancion1.getTitulo()+"\nEl ID de la cancion es: "+cancion1.getId()
        
        +"\nEl año de la cancion es: "+cancion1.getAnio()+"\nLa duracion de la cancion es: "+cancion1.getDuracion());
         
    }
    
}
