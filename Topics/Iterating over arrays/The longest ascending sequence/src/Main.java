import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        int max = count;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] <= arr[j + 1]) {
                count++;
                max = count;
            } else {
                count = 1;
            }
        }
        System.out.print(max);
    }
}