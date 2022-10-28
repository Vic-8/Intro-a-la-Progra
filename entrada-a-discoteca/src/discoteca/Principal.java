/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoteca;

import java.util.Scanner;

/**
 *
 * @author Rose
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean continuar = true;

        while (continuar) {

            Scanner sc = new Scanner(System.in);
            Persona p = new Persona();

            System.out.println("Ingresa tu primer nombre");

            //String name = sc.nextLine();
            p.setPrimerNombre(sc.nextLine());

            System.out.println("Ingresa tu segundo nombre");
            p.setSegundoNombre(sc.nextLine());

            System.out.println("Ingresa tu primer apellido");
            p.setPrimerApellido(sc.nextLine());

            System.out.println("Ingresa tu segundo apellido");
            p.setSegundoApellido(sc.nextLine());

            System.out.println("Ingresa tu fecha de nacimiento");
            p.setFechaDeNacimiento(sc.nextLine());

            boolean esMayorDeEdad = p.verificarMayoriaDeEdad(p.getFechaDeNacimiento());

            if (esMayorDeEdad) {

                System.out.println("Usted puede entrar a la discoteca porque es mayor de edad " + p.getPrimerNombre() + " " + p.getSegundoNombre() + " " + p.getPrimerApellido() + " " + p.getSegundoApellido());
            } else {

                System.out.println("Usted NO puede entrar a la discoteca porque es menor de edad");
            }
            System.out.println("");
            
            System.out.println("Desea salir del programa presione S, de lo contrario presione cualquier tecla ");
            char salir = sc.next().charAt(0);
            
            if (salir=='S' && salir == 's'){
                
                continuar = false;
            }
            

        }

    }

}
