import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    mas[i][j] = 0;
                } else if (i == 0) {
                    mas[i][j] = j;
                    mas[j][i] = j;
                } else if (j > 0) {
                    mas[i][j] = mas[i - 1][j - 1];
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}