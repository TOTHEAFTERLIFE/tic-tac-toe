import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                newArr[j] = arr[n - 1];
            } else {
                newArr[j] = arr[j - 1];
            }
            System.out.print(newArr[j] + " ");
        }
    }
}