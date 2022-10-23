/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
//EJERCICIO de GET AND SET

public class Usuario {

    public String nombre;
    public String correo;
    private String clave;
    private Estado rol; // Esto es del ejercicio enum

    public String getClave() {
        String str = "";
        for (int i = 0; i < clave.length(); i++) { //.length nos da el largo de caracteres de un atributo
            //str = str + ".";
            str = clave; //es prueba que str tiene tantos caracteres como clave
        }
        return str;
    }

    public void setClave(String clave) {
        if (clave.length() > 7) {

            char a = '\0';
            char b = '\0';

            for (int i = 0; i < clave.length(); i++) {

                b = a;
                a = clave.charAt(i);

                if (a != b) {
                    this.clave = clave;
                } else {
                    System.out.println("La clave no es valida: Caracteres iguales");
                }
            }

        } else {
            System.out.println("Clave no es valida por falta de caracteres");
        }
    }

    // FIN DE EJERCICIO CON GET AND SET
    // INICIO DE EJERCICIO CON CONSTRUCTORES

    public Usuario(String nuevaClave) {
        char a = '\0';
        char b;
        
        for (int i = 0; i < nuevaClave.length(); i++) {
            
           b=a;
           a=nuevaClave.charAt(i);
            if (a!=b && nuevaClave.length()>7) {
                clave=nuevaClave;
                
            } else{
                System.out.println("La clave no es valida");
            }
            
        }
        
    }

public static int numeroAleatorio(int minimo, int maximo){

return ThreadLocalRandom.current().nextInt(minimo,maximo+1);
}

    public Usuario() {
        String caracter = "qwertyuiopasdfdhjklzxcvbmasn123456789";
        String nuevaClave = "";
        
        for (int i = 0; i < 10; i++) {
            int indice = numeroAleatorio(0,caracter.length()-1);
            char caracterAleatorio = caracter.charAt (indice);
            nuevaClave=nuevaClave+caracterAleatorio;
        }
        clave=nuevaClave;
        
    }

    public Estado getRol() {
        return rol;
    }

    public void setRol(Estado rol) {
        if (rol==Estado.Administrador) {
            this.rol=rol;
        }
        else if (rol==Estado.Asistente) {
            this.rol=rol;
        }
                else if (rol==Estado.Cajero) {
            this.rol=rol;
        }
                else if (rol==Estado.Supervisor) {
            this.rol=rol;
        }

    }

    

    
}
