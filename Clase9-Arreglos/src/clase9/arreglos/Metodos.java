/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Metodos {
    
    public String nombre;
    public String apellidos;
    public int edad;
    public double salario;
    public double sumaSalario;
    public double total;
    
       public Metodos (String nombre, String apellidos, int edad, double salario, double sumaSalario, double total) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
        this.sumaSalario = sumaSalario;
        this.total = total;
    }
    
       
       public static void llenarArreglo() {
           Metodos Arreglo[] = new Metodos[5];
       for (int x = 0; x < Arreglo.length; x++) {
           
        JOptionPane.showMessageDialog(null, "Se le solicitaran los datos del empleado "+x);
        
        String nombre = JOptionPane.showInputDialog("Escriba el nombre del empleado");
        String apellidos = JOptionPane.showInputDialog("Escriba los apellidos del empleado");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del empleado"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado"));

        }
}}


