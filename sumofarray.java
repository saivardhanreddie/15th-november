import java.util.Scanner;

public class sumofarray {
    int[] arr = new int[6];

    public int sumOfArray(int[] arr) {
        int Sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            Sum = Sum + i;
        }
        return Sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumofarray ob = new sumofarray();
        System.out.println(ob.sumOfArray(new int[] { 5, 9, 2, 1, 3, 4 }));
    }
}