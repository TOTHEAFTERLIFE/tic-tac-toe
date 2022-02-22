import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double count = 0;
        double sum = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}