/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.util.Scanner;

/**
 *
 * @author olista94
 */
public class Practica0 {

    public static void intercambiarValores (int num1, int num2){
        System.out.println("La variable 1 es: "+ num1);
        System.out.println("La variable 2 es: "+ num2);
        
        int aux = num1;
        num1=num2;
        num2=aux;
        
        System.out.println("La variable 1 es: "+ num1);
        System.out.println("La variable 2 es: "+ num2);
    }
    
    public static void tipoNumero(){
        int num;
    
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Introduce un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        if(num % 2 == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
        
        if(num == 0){
            System.out.println("Numero cero");
        }
        else{
            System.out.println("Numero distinto de cero");
        }
        if (num > 100) {
            System.out.println("Numero elevado");
        }
        else{
            System.out.println("Numero bajo");
        }
    }
    
    public static void main(String[] args) {
        intercambiarValores(2,3);
        
        tipoNumero();
    }
    
}
