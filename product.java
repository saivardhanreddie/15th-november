import java.util.Scanner;

public class product {

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product ob = new product();

        System.out.println("Enter the 1st Number :- ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number :- ");
        int n2 = sc.nextInt();
        System.out.println("The Product of two number is :- " + ob.multiply(n1, n2));
        System.out.println();
    }
}