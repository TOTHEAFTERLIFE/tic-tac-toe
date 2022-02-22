import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int n = 1;
        while (n <= (int) Math.sqrt(num)) {
            System.out.println(n * n);
            n++;
        }
    }
}