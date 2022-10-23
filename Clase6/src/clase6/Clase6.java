/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*EJERCICIO GET AND SET
        // Clase Usuario con al menos 3 atributos, una de contraseña, privado y contar con encapsuladores devolviendo solo asteriscos. 
        // Contraseña con 8 caracteres
        // No haber dos caracteres iguales seguidos
        
        Usuario usuario1 = new Usuario();
        
        String clave = JOptionPane.showInputDialog("Digite una clave");
        usuario1.nombre = "Victor";
        usuario1.correo = "victor@hotmail.com";
        
        usuario1.setClave(clave); // o JOptionPane.showInputDialog("Digite una clave");
        
        //System.out.println(usuario1.getClave()); //Como no se salva la clave cuando faltan caracteres. al intentar hacer un print el usuario1 intenta retornar un string q no existe. Esta vacio
        */
        //FIN DE EJERCICIOP GET AND SET
        
        // INICIO EJERCICIO DE CONSTRUCTORES
        /*
        Usuario usuario2 = new Usuario("Pajaro123");
        System.out.println(usuario2.getClave());
        */
        /*
        Usuario usuario3 = new Usuario();
        
        System.out.println(usuario3.getClave());
          */
        // FIN EJERCICIO DE CONSTRUCTORES
        //EJERCICIO ENUM
        
        Usuario usuario4 = new Usuario ();
        int valor =0 ;
        while (valor>=0){
        
            valor=Integer.parseInt(JOptionPane.showInputDialog("1. Administrados"
                    + " , 2. Asistente, 3. Cajero, 4. Supervisor"));
            if (valor==1) {
                usuario4.setRol(Estado.Administrador);
                
            }
            else if (valor==2){
            usuario4.setRol(Estado.Asistente);
            }
            else if (valor==3){
            usuario4.setRol(Estado.Cajero);
            }
                        else if (valor==4){
            usuario4.setRol(Estado.Supervisor);
            }
        }
       JOptionPane.showMessageDialog(null, usuario4.getRol());
    
       //PRACTICA COLEGIADA
    }
    
}
