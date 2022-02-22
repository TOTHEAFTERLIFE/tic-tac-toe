import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int count = 0;
        while (m < k) {
            m = m + m * p / 100;
            count++;
        }
        System.out.println(count);
    }
}