import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        BigInteger a = new BigInteger(kb.next());
        BigInteger b = new BigInteger(kb.next());

        System.out.println(a.add(b));
    }
}