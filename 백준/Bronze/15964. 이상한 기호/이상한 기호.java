import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        System.out.println((num1 + num2) * (num1 - num2));
    }
}