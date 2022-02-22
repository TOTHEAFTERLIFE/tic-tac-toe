import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int count = 1;
        boolean broken = false;
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                if (broken) {
                    break;
                }
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 0) {
                        System.out.print(i + 1);
                        broken = true;
                        break;
                    }
                }
            }
        } else if (k > 1) {
            for (int i = 0; i < n; i++) {
                if (broken) {
                    break;
                }
                for (int j = 0; j < m - 1; j++) {
                    if (arr[i][j] == 0 && arr[i][j + 1] == 0) {
                        count++;
                        if (count == k) {
                            System.out.print(i + 1);
                            broken = true;
                            break;
                        }
                    } else {
                        count = 1;
                    }
                }
                if (!broken) {
                    count = 1;
                }
            }
        }
        if (count == 1 && k != 1) {
            System.out.print(0);
        }
    }
}