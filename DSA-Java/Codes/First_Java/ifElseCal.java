package First_Java;

import java.util.Scanner;

public class ifElseCal {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value.
        //(Use if conditions)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1= input.nextInt();
        int num2= input.nextInt();

        System.out.println("Enter an operator ");
        char op = input.next().trim().charAt(0);

        if (op == '+') {
            System.out.println(num1+num2);
        }
        if (op == '-') {
            System.out.println(num1-num2);
        }
        if (op=='/'){
            if (num2!=0){
                System.out.println(num1 / num2);
            }else{
                System.out.println("Not Divisible by zero");
            }
        }
        if (op == '%') {
            System.out.println(num1 % num2);
        }
        if (op=='*'){
            System.out.println(num1*num2);
        }
        else {
            System.out.println("invalid Operator");
        }
    }
}
