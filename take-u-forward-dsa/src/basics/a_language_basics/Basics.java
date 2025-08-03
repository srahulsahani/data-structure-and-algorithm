package basics.a_language_basics;

import java.util.Scanner;

public class Basics {

    //Print largest of three integer number, take input from user.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The greatest number is : "+ num1);
        }
        else if(num1<num2 && num2>num3){
            System.out.println("The greatest number is : "+ num2);
        }
        else if(num1<num2 && num2<num3){
            System.out.println("The greatest number is : "+ num3);
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
