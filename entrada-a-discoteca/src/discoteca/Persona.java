/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoteca;

import java.util.Calendar;

/**
 *
 * @author Rose
 */
public class Persona {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaDeNacimiento;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean verificarMayoriaDeEdad(String pFechaNacimiento) {

        boolean esMayorDeEdad = false;
        //08-09-1900
        String[] fechaSeparada;
        int diaNacimiento;
        int mesNacimiento;
        int añoNacimiento = 2030;

        //08-04-1989
        if (pFechaNacimiento.contains("-")) {

            fechaSeparada = pFechaNacimiento.split("-");
            diaNacimiento = Integer.parseInt(fechaSeparada[0]);
            //System.out.println("Imprimo el dia " + diaNacimiento);

            mesNacimiento = Integer.parseInt(fechaSeparada[1]);
            // System.out.println("Imprimo el mes " + mesNacimiento);

            añoNacimiento = Integer.parseInt(fechaSeparada[2]);
            // System.out.println("Imprimo el año " + añoNacimiento);

            //08/04/1989
        } else if (pFechaNacimiento.contains("/")) {

            fechaSeparada = pFechaNacimiento.split("/");
            diaNacimiento = Integer.parseInt(fechaSeparada[0]);
            //  System.out.println("Imprimo el dia " + diaNacimiento);

            mesNacimiento = Integer.parseInt(fechaSeparada[1]);
            // System.out.println("Imprimo el mes " + mesNacimiento);

            añoNacimiento = Integer.parseInt(fechaSeparada[2]);
            //System.out.println("Imprimo el año " + añoNacimiento);

            //08.04.1989
        } else if (pFechaNacimiento.contains(".")) {

            fechaSeparada = pFechaNacimiento.split("\\.");
            diaNacimiento = Integer.parseInt(fechaSeparada[0]);
            // System.out.println("Imprimo el dia " + diaNacimiento);

            mesNacimiento = Integer.parseInt(fechaSeparada[1]);
            //System.out.println("Imprimo el mes " + mesNacimiento);

            añoNacimiento = Integer.parseInt(fechaSeparada[2]);
            //System.out.println("Imprimo el año " + añoNacimiento);

            //08041989
        } else if (!pFechaNacimiento.contains(" ")) {

            diaNacimiento = Integer.parseInt(pFechaNacimiento.substring(0, 2));
            //System.out.println(diaNacimiento);

            mesNacimiento = Integer.parseInt(pFechaNacimiento.substring(2, 4));
            //System.out.println(mesNacimiento);

            añoNacimiento = Integer.parseInt(pFechaNacimiento.substring(4, 8));
            //System.out.println(añoNacimiento);
        }

        Calendar c1 = Calendar.getInstance();

        //System.out.println("Estamos en el año " + c1.get(Calendar.YEAR));
        int edad = c1.get(Calendar.YEAR) - añoNacimiento;
        //System.out.println("Su edad es " + edad);

        if (edad >= 18) {
            esMayorDeEdad = true;

        } else {
            esMayorDeEdad = false;
        }

        return esMayorDeEdad;
    }

}
