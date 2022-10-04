/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package jiun.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Clase3 {

    public static void main(String[] args) {

        /*
     //For Basico:   
        for (int i=1; i<=5;i++){
        System.out.println("I vale: "+i);
    }
         */
 /*
                for (int i=1; i<=50;i+=10){
        System.out.println("I vale: "+i);
        
    }
         */
        //Ejemplo While Basico:
        /*
        int i = 1;
        int suma = 0;
        
        while (i<=10){
        suma = suma + i;
        ++i; //i+=2        
        }
             System.out.println(suma);
         */
        //Ejercicio de imprimir rectangulo de @ forma vage
        /*
            int i = 1;
            
            
            while (i<=5){
                System.out.println("@@@@@@@@@@");
                i++;
            }
         */
        //Ejercicio bien
        /*
        int a =0;
        String b = "@@@@@@@@@@";
        while (a<5){
            System.out.println(b);
            a++;
        }
         */
        //Ejercicio con For del rectangulo:
        /*
        String b = "@@@@@@@@@@";
        for (int i = 0; i < 5; i++) {
            System.out.println(b);
            
        }
         */
 /*
       // Ejemplo do-While
      
       int numero = 0;
       String mensaje = "El valor del variable numero aun no supera o iguala la condicional.";
       
        do {
            System.out.println(mensaje);
            ++numero;
        } while (numero<10);
         */
 
 /*
        //Ejemplo do-while
        int numero = 1;
        do {
            System.out.println(numero);
            numero = numero + 1; //o numero++
        } while (numero <= 20);
*/
 
 //ERROR de AMBITO DE FOR
/*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i); //No imprime xq i de arriba es una variable local dentro del for. Se puede declarar por fuera int i; y remover int por i nadamas sin anda dentro del for
    
*/

//Anidacion de Ciclos
//Con While
/*
int valor1 =0;
while(valor1<=5){
    System.out.println("Este numero pertenece al while externo"+valor1);
    int valor2=0;
    while(valor2<=2){
        System.out.println("Este numero pertenece al while interno"+valor2);
        valor2++;
    }
valor1++;
System.out.println();
 }
*/
//FOR ANIDADO
/*
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
            }
        }
*/
//Ejercicio de imprimir @ una a la vez
/*
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j <10; j++) {
                System.out.print("@");
            }
        }
*/
//Ejercicio de @ que el usuario defina cuantas columnas y filas
/*
int columnas;
int filas;

columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de Columnas"));
filas = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de Filas"));

int i =0;
int j=0;

while(i<filas){
while(j<columnas){
    System.out.print("@");
    j++;
}
    System.out.println("@");
    j=0;
    i++;
}
*/
/*
//Muestre una tabla de multiplicar
int numero;
int multi;
int i=1;
numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
while(i<=10){
multi=numero*i;
    System.out.println(numero+"x"+i+"="+multi);
    i++;
}
*/
//Dibuje un triangulo con asterisco con el numero de filas indicado

/*
int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de filas"));

        for (int i = 0; i <= numero; i++) {
            System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            }
        }
*/
/*
//Con While
int i=1;
int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de filas"));

while(i<=numero){
    int j=1;
    while(j<=i){
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
*/

int contador=0;
int suma=0;
double promedio=0;
int mayor=0;
int menor=100;
int aprobados=0;
int nota=0;
int reprobados=0;

       
while(nota>=0){
    
    nota = Integer.parseInt(JOptionPane.showInputDialog("Digite nota "+"numero negativo para salir"));
    
    if(nota<0){
        break;
    }    
    if (nota>mayor){
    mayor=nota;
    }
     if (nota<menor){
    menor=nota;
    }
     if (nota>=70){
     aprobados=aprobados+1;
     }
          if (nota<70){
     reprobados=reprobados+1;
     }
    suma=suma+nota;
    contador++;          
    }
promedio=(promedio+suma)/contador;

JOptionPane.showMessageDialog(null, "El promedio es: "+promedio+"\n La nota mas alta es: "+mayor+"\n La nota menor es: "+menor+"\n Aprobados: "+aprobados+"\n Reprobados: "+reprobados+"\n Cantidad de notas: "+contador);


}
}
