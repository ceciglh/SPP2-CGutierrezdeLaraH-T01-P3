/*//Cecilia Gutierrez de Lara Hernandez-A01410404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.t01.p3;
import java.util.Scanner;
/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir variables
    double x1,y1,x2,y2,D;
    Scanner kb=new Scanner (System.in);
    //Pedir coordenadas
        System.out.println("Inserte la coordenada x del punto 1");
          x1=kb.nextDouble();
          System.out.println("Inserte la coordenada y del punto 1");
          y1=kb.nextDouble();
        System.out.println("Inserte la coordenada x del punto 2");
          x2=kb.nextDouble();
          System.out.println("Inserte la coordenada y del punto 2");
          y2=kb.nextDouble();
          //Ecuacion para sacar distancia
        D=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        //Ejecutar programa y mostrar resultado
        System.out.println("La distancia entre estos dos puntos es de" + D);
          
    
    }
    
}
