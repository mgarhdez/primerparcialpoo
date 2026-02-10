/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * Descripcion del problema
 * Hacer un programa ue leea una cantidad en pesos
 * y los convierta en dolares, euros, libras
 * donde el dolar vale 18p, Euro vale 1.20dolares,
 * y libra 1.05 Euros
 */
public class Programa4 {
    //constantes
    static int d = 18;
    static float e = 1.20f;
    static float l = 1.05f;
    static int pesos;
    static float resultado = 0.0f;
    
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Escribe una cantidad en pesos: ");
        pesos = numeros.nextInt();
        resultado = (float)pesos / d;
        System.out.println("Los dolares son: "+ resultado);
        resultado = resultado / e;
        System.out.println("Los euros son: "+resultado);
        resultado = resultado / l;
        System.out.println("Los libras son: "+resultado);
    }    
}
