import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("1. kenar: ");
        int kenar1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("2. kenar: ");
        int kenar2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("3. kenar: ");
        int kenar3 = input3.nextInt();

        int cevre = kenar1+kenar2+kenar3;
        double u = cevre/2;
        double alankare = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        double alan = Math.sqrt(alankare);

        System.out.println(alan);
    }
}
