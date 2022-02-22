import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int q = 10, rev = 0;
        for (int i = 0; i < 3; i++) {
            rev *= q;
            rev += num % q;
            num /= q;
        }
        System.out.println(rev);
    }
}