import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int max = 0;
        int num;
        if (n <= 1000) {
            for (int i = 0; i < n; i++) {
                num = scanner.nextInt();
                if (num % 4 == 0 && max < num) {
                    max = num;
                }
            }
        }
        System.out.println(max);
    }
}