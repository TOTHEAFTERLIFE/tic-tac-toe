import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int p = 0;
        int num;
        int count = scanner.nextInt();
        do {
            num = scanner.nextInt();
            count--;
            if (num % 4 == 0 && num > p) {
                p = num;
            }
        } while (count != 0);
        System.out.println(p);
    }
}