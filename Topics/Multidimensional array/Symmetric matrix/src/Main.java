import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mas = new int[n][n];
        boolean result = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] != mas[j][i]) {
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}