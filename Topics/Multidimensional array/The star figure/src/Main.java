import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] mas = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == n / 2 || j == n / 2) {
                    mas[i][j] = "*";
                } else {
                    mas[i][j] = ".";
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}