package Clases;

import java.util.Scanner;


public class Programa6 {
    public static void main(String[] args) {
        /*
        Hacer un programa que leea 4 numeros
        y que calcule el promedio de ellos
        */
        Scanner leer = new Scanner (System.in);
        double n1, n2,n3,n4;
        double resultado = 0.0;
        double Materias = 4;
        System.out.println("Escribe primer numero: ");
        n1 = leer.nextDouble();
        System.out.println("Escribe segundo numero: ");
        n2 = leer.nextDouble();
        System.out.println("Escribe tercero numero: ");
        n3 = leer.nextDouble();
        System.out.println("Escribe cuarto numero: ");
        n4 = leer.nextDouble();
        resultado = (n1 + n2 + n3 + n4) / Materias;
        System.out.println("Promedio: " + resultado);
    }
}
