/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Programa3 {
        private static String nombre;// cadena de caracteres 
        private static float estatura;
        private static char sexo;
        private static int edad;
        public static void main(String[] args) {
        // 3 formas de leer datos 
        nombre = JOptionPane.showInputDialog("Escribe el nombre");
        //casting conversion     implicita y/o explicita  
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Escribe la estatura de la persona")); 
         sexo = JOptionPane.showInputDialog("Escribe el sexo de una persona").charAt(0); 
       edad =  Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad de la persona"));
        JOptionPane.showMessageDialog(null, "El nombre es: " +nombre+ "\n"
                + " su estatura es: "+ estatura+ "\n "
                + "Su sexo es" + sexo + "\n"
                + "  su edad es: "+ edad);
        
    } 
    
}
