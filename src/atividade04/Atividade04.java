package atividade04;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade04 {

    /**
     * Escreva um algoritmo que leia  10 valores inteiros. 
     * Durante a entrada de dados, conte quantos valores positivos existem. 
     * Ao término mostre o resultado.
     */
    public static void main(String[] args) {
        
        int ValoresPos, x , cont;
        
        cont = 1;
        ValoresPos = 0;
        
        
        while(cont <= 10){
            cont++;
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira qualquer valor: "));
            
            if(x >=0){
                ValoresPos++;
            }
                
      }
        
        JOptionPane.showMessageDialog(null , "O Total de valores positivos inseridos foi de: "+ValoresPos);
    }
    
}
