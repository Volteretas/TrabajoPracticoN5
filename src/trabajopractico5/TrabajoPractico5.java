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
public class TrabajoPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {11,11,11,11};
        Arreglo.sumarLista(num);
        
        int numB[][] = {{0,6,3},{4,2,-1},{23,6,1},{-141,12,4}};
        Arreglo.buscarMayor(numB);
        
        Arreglo.cuentaVocales("Hola amigos de youtube");
        
        Arreglo.cuentaCaracter("Hola amigos de youtube", 'o');
    }
    
}
