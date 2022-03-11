/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxnum;

/**
 *
 * @author Black Widow
 */
import java.util.Scanner;
public class MaxNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner input = new Scanner (System.in);
        a = input.nextInt();
        b = input.nextInt();
        if(a>b)
                {
                    System.out.println("Max is : "+a);
                }
        else
        {
            System.out.println("Max is : "+b);
        }
    }
    
}
