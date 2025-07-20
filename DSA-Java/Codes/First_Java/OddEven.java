package First_Java;

import java.util.Scanner;

public class OddEven {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check whether its odd or even : ");
        int num= input.nextInt();

        if (num %2 ==0) {
            System.out.println("Its an Even Number");
        }else{
            System.out.println("Its an Odd Number");
        }

    }


}
