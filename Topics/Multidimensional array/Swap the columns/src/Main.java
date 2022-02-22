import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = scanner.nextInt();
            }
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first > second) {
            int b = first;
            first = second;
            second = b;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == first) {
                    int a = mas[i][j];
                    mas[i][j] = mas[i][second];
                    mas[i][second] = a;
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}