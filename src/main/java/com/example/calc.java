package com.example;

import java.util.Scanner;

class calc{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Enter act(+,-,*,/): ");
        String str1 = scan.next();

        switch(str1){
            case "+": 
                System.out.println("Resault: "+ (a + b));
                break;
                
            case "-":
                System.out.println("Resault: "+ (a - b));
                break;
                
            case "/":
            
                System.out.println("Resault: "+ (a / b));
                break;
                
            case "*":
                System.out.println("Resault: "+ (a - b));
                break;
                
            default: 
                System.out.println("what you enter????");
                break;
                
        }
        return; 

    }
}
