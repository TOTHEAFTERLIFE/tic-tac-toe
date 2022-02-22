import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean result = true;
        for (int j = 0; j < size - 1; j++) {
            if (arr[j] == m && arr[j + 1] == n || arr[j] == n && arr[j + 1] == m) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}