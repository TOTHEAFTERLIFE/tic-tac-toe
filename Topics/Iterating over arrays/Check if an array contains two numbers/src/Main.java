import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean result = false;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] == num1 && arr[j + 1] == num2 || arr[j] == num2 && arr[j + 1] == num1) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
