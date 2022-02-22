import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int sum = 0;
        int q = 10;
        for (int i=0; i<3; i++) {
            int k = num % q;
            num = num / q;
            sum += k;
        }
        System.out.println(sum);
    }
}