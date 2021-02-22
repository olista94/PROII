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
        
    }
    
    public static void main(String[] args) {
        intercambiarValores(2,3);
        
        tipoNumero();
    }
    
}
