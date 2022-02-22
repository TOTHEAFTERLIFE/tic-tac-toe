import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] oldArr = new int[n][m];
        int[][] newArr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                oldArr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = oldArr[n - 1 - j][i];
                System.out.print(newArr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}