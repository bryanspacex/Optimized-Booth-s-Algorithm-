import java.util.Scanner;

public class Booth {
    public int multiply(int n1, int n2) {
        int P = 0;
        while (n2 != 0) {
            if ((n2 & 1) == 1) {
                P += n1;
            }
            n1 <<= 1;
            n2 >>= 1;
        }
        return P;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Booth b = new Booth();
        System.out.println("Enter two integer numbers:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = b.multiply(n1, n2);
        System.out.println("\nResult: " + n1 + " * " + n2 + " = " + result);
    }
}
