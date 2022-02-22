import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //number of companies
        int[] yearly = new int[n];
        int[] individual = new int[n];
        int[] taxes = new int[n];
        int company = 1;
        for (int i = 0; i < n; i++) {
            yearly[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            individual[j] = scanner.nextInt();
        }
        for (int q = 0; q < n; q++) {
            taxes[q] = individual[q] * yearly[q];
        }
        for (int q = 0; q < n - 1; q++) {
            if (taxes[q] < taxes[q + 1]) {
                company = q + 2;
            }
        }
        System.out.println(company);
    }
}