import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            result = arr[i].compareTo(arr[i + 1]) <= 0;
        }
        System.out.print(result);
    }
}