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
public class Programa3_1{
    private static String nombre = "120";//Cadena de caracteres
    private static float estatura;
    private static char sexo;
    private static int edad;
    private static String sexo2;
    
    public static void main(String[] args) throws IOException {
    /*
   // 3 formas de leer datos
   nombre = JOptionPane.showInputDialog("Escribe el nombre");
   //casting conversion implicita y/o Explicita
   estatura = Float.parseFloat(JOptionPane.showInputDialog("Escribe la estatura"));
   sexo = JOptionPane.showInputDialog("Escribe el sexo de la persona").charAt(0);
   edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad de la persona"));
   JOptionPane.showMessageDialog(null, "El nombre es: " +nombre+"\n"
           + "Y su estatura es:" + 
           estatura + "\n" + "el sexo es:" + sexo + "\n" + "y su edad es:" + edad);
   */
   
   Scanner leer = new Scanner (System.in);
   BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));
   
        System.out.println("Escribe el nombre: ");
        nombre = escribir.readLine();
        System.out.println("Escirbe la estatura de una persona: ");
        estatura = leer.nextFloat();
        System.out.println("Escribe el sexo: ");
        sexo = escribir.readLine().charAt(0);
        //sexo = sexo2.charAt(1);
        System.out.println("Escribe la edad: ");
        edad = leer.nextInt();
    }
}