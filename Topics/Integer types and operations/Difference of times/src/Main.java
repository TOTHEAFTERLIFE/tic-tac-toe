import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int first = seconds1 + minutes1 * 60 + hours1 * 3600;
        int second = seconds2 + minutes2 * 60 + hours2 * 3600;
        System.out.print(second - first);
    }
}