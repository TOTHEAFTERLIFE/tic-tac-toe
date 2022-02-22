import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int j = 0; j < 3; j++) {
            box2[j] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        for (int p = 0; p < 3; p++) {
            if (box1[p] < box2[p]) {
                count++;
            } else if (box1[p] > box2[p]) {
                count--;
            }
        }
        if (count == 3) {
            System.out.println("Box 1 < Box 2");
        } else if (count == -3) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}