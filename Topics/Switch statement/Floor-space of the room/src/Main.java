import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String type = scanner.nextLine();
        switch (type) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "circle":
                double r = scanner.nextInt();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
        }
    }
}