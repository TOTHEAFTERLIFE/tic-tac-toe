import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < n - 2; j++) {
            if (arr[j + 2] - arr[j + 1] == 1 && arr[j + 1] - arr[j] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}