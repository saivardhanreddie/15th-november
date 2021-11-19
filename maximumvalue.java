import java.util.Scanner;

public class maximumvalue {
    public int findMaxValue(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public int findMaxValue(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    public int findMaxValue(int x, int y, int z, int w) {
        if (x > y && x > z && x > w) {
            return x;
        } else if (y > x && y > z && y > w) {
            return y;
        } else if (z > x && z > y && z > w) {
            return z;
        } else {
            return w;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maximumvalue ob = new maximumvalue();
        System.out.println(ob.findMaxValue(25, 35));
        System.out.println(ob.findMaxValue(12, 34, 56));
        System.out.println(ob.findMaxValue(78, 56, 34, 12));
        System.out.println();
    }
}