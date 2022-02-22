import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j = 0; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.print(min);
    }
}