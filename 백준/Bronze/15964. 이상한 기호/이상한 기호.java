import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);

        Long num1 = kb.nextLong();
        Long num2 = kb.nextLong();

        System.out.println((num1 + num2) * (num1 - num2));
    }
}