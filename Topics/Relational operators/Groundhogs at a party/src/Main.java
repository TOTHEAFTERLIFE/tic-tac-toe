import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int num = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (!weekend && num >= 10 && num <= 20) {
            System.out.println(true);
        } else if (weekend && num >= 15 && num <= 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}