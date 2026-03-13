import java.util.Scanner;

public class Prog1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }

        sc.close();
    }
}
