package Practice;

import java.util.Scanner;

public class Repls {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

    StringBuilder poly=new StringBuilder();
    poly.reverse();
if (poly.toString().equals(givenString)){
    System.out.println("true");
    }
else {
    System.out.println("false");
}
}}