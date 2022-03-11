/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package luckynumber;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class LuckyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        System.out.print("Give a Four Number : ");
        int n = s.nextInt();
        //ABCD
        int fourthdigit = n%10; //D
        int third_digit = (n/10)%10; //C
        int second_digit = (n/100)%10; //B
        int first_digit = (n/1000)%10; //A
        if(first_digit+second_digit==third_digit+fourthdigit)
        {
            System.out.println("Number is Lucky");
        }
        else 
            System.out.println("Not Lucky ");
    }
    
}
