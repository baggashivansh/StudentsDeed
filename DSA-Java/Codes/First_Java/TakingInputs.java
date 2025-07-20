package First_Java;

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write your name :");
        String name= input.nextLine();
        System.out.print("Enter your Favorite Number: ");
        int favNum=input.nextInt();
        System.out.println("Hey "+name+ "!"+" Your Favorite Number is "+favNum);




    }
}
