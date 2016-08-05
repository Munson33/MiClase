/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Enrique
 */
import java.util.Scanner;
public class MiClase {
    public static void main (String args[]){
        
        Scanner lea= new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int numero=lea.nextInt();
        if (numero>10){
            System.out.println("El numero es mayor a 10");
        } else{
            System.out.println("El numero es menor a 10");
        }
        
    }
    
}
