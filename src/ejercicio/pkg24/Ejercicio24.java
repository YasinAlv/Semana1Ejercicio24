/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=0;
        String frase = "La lluvia en Sevilla es una maravilla";
        int [] lista = new int [frase.length()];
        
        for (int i = 0; i < frase.length(); i++) {
             
             char letra = frase.charAt(i);
             int ASCII;
             lista[i]= ASCII = (int)letra; 
        }
        
        System.out.println("Lista de los caracteres en ASCII");
        for (int i = 0; i < lista.length; i++) {
            
            System.out.print(lista[i]+" ");
        }
        
     
        
    }
}
