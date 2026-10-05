/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package receiptprinter;

/**
 *
 * @author HP
 */
public class Receiptprinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="T_shirt";
        String name2="Pant";
        String name3="Hoody";
        double price1=100.90;
        double price2=105.9;
        double price3=170.97;
      System.out.printf("%-15s%10s\n","Items","Price");
      System.out.println("_____________________________________________");
      System.out.printf("%-15s%10s\n",name,price1);
      System.out.printf("%-15s%10s\n",name2,price2);
      System.out.printf("%-15s%10s\n",name3,price3);
      
        
        
        
    }
    
}
