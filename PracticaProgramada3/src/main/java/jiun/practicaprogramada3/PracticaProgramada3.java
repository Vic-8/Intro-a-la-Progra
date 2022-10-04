/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jiun.practicaprogramada3;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class PracticaProgramada3 {

    public static void main(String[] args) {

        //Un corredor de Fórmula 1 requiere de un programa que le capture los tiempos
//realizados en cada vuelta y los tiempos utilizados en PITS, de manera que este al final le
//indique lo siguiente:
//• Cuál es el tiempo promedio por vuelta.
//• Cuál es el tiempo promedio por PITS.
//• Qué porcentaje del tiempo PITS corresponde al tiempo de recorrido de una
//vuelta. • Considere que son 10 vueltas y 10 entradas a PITS.
  
/*
double promedioVuelta=0;
double promedioPIT=0;
int sumaVuelta=0;
int sumaPIT=0;
int Vuelta=0;
int PIT=0;
int contador=0;
double Porcentaje=0;

        for (int i = 0; i < 10; i++) {
            Vuelta=Integer.parseInt(JOptionPane.showInputDialog("Digite duracion de vuelta"));
            PIT=Integer.parseInt(JOptionPane.showInputDialog("Digite duracion de PIT"));
            sumaVuelta=sumaVuelta+Vuelta;
            sumaPIT=sumaPIT+PIT;
            contador++;
        }
        promedioVuelta=(sumaVuelta+promedioVuelta)/10;
        promedioPIT=(sumaPIT+promedioPIT)/10;
        Porcentaje=(promedioPIT*100)/promedioVuelta;

        JOptionPane.showMessageDialog(null,"El tiempo promedio por vuelta es: "+promedioVuelta+"\nEl tiempo promedio en PIT es: "+promedioPIT+
                "\nEl porcentaje de tiempo en PIT en vuelta es: "+Porcentaje+"%");
*/

//Se requiere analizar las estaturas de los N niños de una escuela y extraer la siguiente estadística:
//• Cantidad de niños que miden menos de 100 cm.
//• Cantidad de niños que miden entre 100 y 120 cm.
//• Cantidad de niños que miden entre 121 y 130 cm.
//• Cantidad de niños que miden entre 131 y 140 cm.
//• Cantidad de niños que miden más de 140 cm.
//• Promedio de estaturas.
//• Muestre los resultados obtenidos.

int contador=0;
int suma=0;
double promedio=0;
int menos100=0;
int e100a120=0;
int e121a130=0;
int e131a140=0;
int emas140=0;
int estatura=0;
double estaturaProm=0;


while(estatura>=0){
    
   estatura = Integer.parseInt(JOptionPane.showInputDialog("Digite estatura, o "+"numero negativo para salir"));
 
if(estatura<0){
        break;
    }   
if(estatura<100){
    menos100=menos100+1;
}
if(estatura>=100 && estatura<=120){
    e100a120=e100a120+1;
}
if(estatura>=121 && estatura <=130){
    e121a130=e121a130+1;
}
if(estatura>=131 && estatura <=140){
    e131a140=e131a140+1;
}
if(estatura>140){
    emas140=emas140+1;
}
suma=suma+estatura;
contador++;
}
estaturaProm=estaturaProm+suma/contador;
JOptionPane.showMessageDialog(null,"Niños que miden menos de 100cm: "+menos100+
        "\nNiños que miden entre 100cm y 129cm: "+e100a120+"\nNiños que miden en"
                + "tre 121cm y 130cm: "+e121a130+"\nNiños que miden más de 140cm: "+emas140+"\nEl promedio de estaturas es de: "+estaturaProm);

    }
}
