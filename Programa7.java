/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author israe
 */
public class Programa7 {
    static int n1;
    public static void main(String[] args) throws IOException {
        //Scanner para numeros 
        //BufferReader letras
        //JOptionPane letras
        Scanner leer = new Scanner(System.in);
        BufferedReader escribir = new BufferedReader (new InputStreamReader(System.in));
        int a = leer.nextInt();
        int b = leer.nextInt();
        float c = leer.nextFloat();
        double e = leer.nextDouble();
        String nombre = escribir.readLine();
        System.out.println("Resultado" + a); //Concatenacion o adicion
       float resultado = (float)(a+b+c+e)/ 4;
       double c1 = Math.sqrt(c);//Sacar la raiz cuadrada 
       double c2 = Math.pow(e, 2/*depende la cantidad es a lo que se va a elevar*/);//elevar a la potencia al cuadrado
       
       
    }
    
}
