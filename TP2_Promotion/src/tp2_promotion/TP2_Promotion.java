/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_promotion;

/**
 *
 * @author metos
 */
public class TP2_Promotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Promotion promotion = new Promotion();
        
        promotion.addStudent("Njomo", "Yannick", 15);
        promotion.addStudent("Frank", "Loic", 16);
        promotion.addStudent("Chijou", "Evans", 10);
        
        
        promotion.displayStudent();
        System.out.println("\n Liste Ordenee :");
        
        promotion.insertionsort();
        promotion.displayStudent();
        
    }
    
}
