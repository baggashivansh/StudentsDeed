package First_Java;

import java.util.Scanner;

public class Greeting {
    //Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=input.next();
        System.out.println("Hello "+name+ "! Hope you are doing good!");
    }
}
