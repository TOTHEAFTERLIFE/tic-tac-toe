import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(str1.replace(" ", "").equalsIgnoreCase(str2.replace(" ", "")));
    }
}