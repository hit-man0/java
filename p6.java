/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project6;

/**
 *
 * @author mijol
 */
import java.util.Scanner;
public class primeornot {
     public static void main(String args[])
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
      
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
