import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num;
        int sum = 0;
        while (true) {
            num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println(sum);
                break;
            } else if (Math.abs(sum) >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}