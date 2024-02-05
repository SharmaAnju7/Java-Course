import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, i, j;

        System.out.print("Enter number of rows:");
        row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] sum = new int[row][col];

        System.out.println("Enter the first Matrix:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second Matrix:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = b[i][j] + a[i][j];
            }
        }

        System.out.println("Sum of two matrices:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
