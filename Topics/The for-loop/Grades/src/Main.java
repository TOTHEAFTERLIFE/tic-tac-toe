import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        String grade;
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;
        for (int i = 0; i <= n; i++) {
            grade = scanner.nextLine();
            if (grade.equals("D")) {
                countD++;
            } else if (grade.equals("C")) {
                countC++;
            } else if (grade.equals("B")) {
                countB++;
            } else if (grade.equals("A")) {
                countA++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);

    }
}