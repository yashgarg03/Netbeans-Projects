/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Two Integers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is : "+c);
    }
    
}
