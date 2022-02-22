import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int normal = scanner.nextInt();
        int maximum = scanner.nextInt();
        int actual = scanner.nextInt();
        if (actual < normal) {
            System.out.println("Deficiency");
        } else if (actual > maximum) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}