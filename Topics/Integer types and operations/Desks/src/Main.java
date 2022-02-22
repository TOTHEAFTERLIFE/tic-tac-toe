import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int studentsGroup1 = scanner.nextInt();
        int studentsGroup2 = scanner.nextInt();
        int studentsGroup3 = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        if (studentsGroup1 % 2 == 0) {
            sum1 = studentsGroup1 / 2;
        } else {
            sum1 = studentsGroup1 / 2 + 1;
        }
        if (studentsGroup2 % 2 == 0) {
            sum2 = studentsGroup2 / 2;
        } else {
            sum2 = studentsGroup2 / 2 + 1;
        }
        if (studentsGroup3 % 2 == 0) {
            sum3 = studentsGroup3 / 2;
        } else {
            sum3 = studentsGroup3 / 2 + 1;
        }
        System.out.print(sum1 + sum2 + sum3);
    }
}