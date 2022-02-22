import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int countLarge = 0;
        int countSmall = 0;
        int countPerfect = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 1) {
                countLarge++;
            } else if (a == -1) {
                countSmall++;
            } else if (a == 0) {
                countPerfect++;
            }
        }
        System.out.println(countPerfect + " " + countLarge + " " + countSmall);
    }
}