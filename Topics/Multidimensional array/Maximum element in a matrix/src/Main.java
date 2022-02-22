import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int max = 0;
        int maxRow = 1;
        int maxColumn = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.print(maxRow + " " + maxColumn);
    }
}