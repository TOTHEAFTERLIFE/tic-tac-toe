import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int bridgesNumber = scanner.nextInt();
        int bridgeHeight;
        for (int i = 0; i < bridgesNumber; i++) {
            bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == bridgesNumber - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}