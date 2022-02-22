import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        boolean asc = true; //по возрастанию
        boolean desc = true; //по убыванию
        int ascNum = n;
        int descNum = n;
        while (n != 0) {
            n = scanner.nextInt();
            if (ascNum > n) {
                asc = false;
                if (descNum < n) {
                    desc = false;
                } else {
                    descNum = n;
                }
            } else {
                ascNum = n;
            }
        }
        System.out.println(asc || desc);
    }
}