/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author israe
 */
public class Programa5 {
    public static void main(String[] args) {
        /*
        operadores aritmeticos
        int + int = int 
        float + float = float
        double + double = double
        String + String = concatenacion(Union de las variables)
        int - int = int
        float - float = float
        double- double = double
        int * int = int
        float * float = float
        double * double = double
        int / int = int
        float / float = float
        double / double = double
        Math.sqrt = raiz
        Math.pow = elevacion de una potencia
        */
        
        Scanner leer = new Scanner (System.in);
        double numero;
        double resultado = 0.0;
        System.out.println("Escribe un numero que se elevara al cuadrado ");
        numero = leer.nextDouble();
        System.out.println("Escribe la potencia");
        double potencia = leer.nextDouble();
        resultado = Math.pow(numero, potencia);
        System.out.println("Resultado: " + resultado);
        
        
        
    }
}
