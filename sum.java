import java.util.*;

public class sum {
    int a, b;

    public sum(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public int sum1(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        sum s = new sum(x, y);
        int result = s.sum1(s.a, s.b);
        System.out.println("Sum: " + result);
    }
}
