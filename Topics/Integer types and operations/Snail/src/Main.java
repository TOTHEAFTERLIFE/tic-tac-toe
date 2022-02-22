import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int count = 0;
        int way = 0;
        while (way < height) {
            way += up;
            if (way < height) {
                way -= down;
            }
            count++;
        }
        System.out.println(count);
    }
}