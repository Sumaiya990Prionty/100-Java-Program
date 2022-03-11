/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenodd;

/**
 *
 * @author Black Widow
 */
import java.util.Scanner;
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Give The Number : ");
        Scanner number = new Scanner (System.in);
        int a=number.nextInt();
        if ((a%2==0)&&(a!=0))
        {
            System.out.println(a+" is "+"Even");
        }
        if(a%2==1)
        {
             System.out.println(a+" is "+"Odd");
        }
        else
        {
            System.out.println(a+" is "+"Invalid");
        }
    }
    
}
