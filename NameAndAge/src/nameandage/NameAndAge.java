/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nameandage;
import java.util.Scanner;
/**
 *
 * @author Black Widow
 */
public class NameAndAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("Enter Your Name : ");
         String name = input.nextLine();
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();
        System.out.println("Your Name is : "+name);
        System.out.println("Your Age is : "+age);
        
        
    }
    
}
