import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean result = true;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 1; j < n; j++) {
            if (arr[j] < arr[j - 1]) {
                result = false;
            }
        }
        System.out.println(result);
    }
}