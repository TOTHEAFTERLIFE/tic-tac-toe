import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.next();
        int experience = scanner.nextInt();
        String preference = scanner.next();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef who cooks "
                + preference + " dishes and has " + experience + " years of experience.");
    }
}
