/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

/**
 *
 * @author Santiago
 */
public class Arreglo {
    static int suma, mayor, cantC;
    static int vocales[]={0,0,0,0,0};
    
    public static void sumarLista(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        System.out.println(suma);
    }
    
    public static void buscarMayor(int[][] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[i].length; j++){
            if(arreglo[i][j] > mayor){
                mayor= arreglo[i][j];
            }
        }
        }
        System.out.println(mayor);
    }
    
    public static void cuentaVocales(String string){
        String frase = string;
        char[] arreglo = frase.toCharArray();
        
        for(int i = 0; i < arreglo.length; i++){
            switch(arreglo[i]){
            case 'a':
            case 'A': vocales[0]++; break;
            case 'e':
            case 'E': vocales[1]++; break;
            case 'i':
            case 'I': vocales[2]++; break;
            case 'o':
            case 'O': vocales[3]++; break;
            case 'u':
            case 'U': vocales[4]++; break;
            }
        }
        System.out.println(" A = " + vocales[0]);
        System.out.println(" E = " + vocales[1]);
        System.out.println(" I = " + vocales[2]);
        System.out.println(" O = " + vocales[3]);
        System.out.println(" U = " + vocales[4]); 
    }
    
    public static void cuentaCaracter(String string, char caracter){
        String frase = string;
        char[] arreglo = frase.toCharArray();
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == caracter){
                cantC += 1;
            }
        }
        
        System.out.println(cantC);
    }
}
