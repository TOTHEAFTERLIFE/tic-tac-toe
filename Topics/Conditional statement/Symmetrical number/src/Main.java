import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int first = number / 100;
        int second = number % 100;
        if (first / 10 == second % 10 && first % 10 == second / 10) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}