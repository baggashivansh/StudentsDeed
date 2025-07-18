package First_Java;
import  java.util.*;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();             //Takes Integer as Input
        //  input.next();                //Takes String as Input only First Word of String till it finds a Space
        //  input.nextLine();             //Takes String as Input whole String

        System.out.println(input.nextLine());
        System.out.println(input.nextInt());
    }
}
