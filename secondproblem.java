import java.util.Scanner;

public class secondproblem {
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public float mul(float num1, float num2) {
        return num1 * num2;
    }

    public long mul(long num1, long num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        secondproblem ob = new secondproblem();
        System.out.println(ob.mul(12, 34));
        System.out.println(ob.mul(6.3f, 5.1f));
        System.out.println(ob.mul(3000, 2000));
        System.out.println();
    }
}