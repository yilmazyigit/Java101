import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapi: ");
        r = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Daire diliminin acisi: ");
        alfa = input2.nextInt();

        double dilimAlan = (pi*(r*r)*alfa)/360;

        System.out.println("daire diliminin alani: "+ dilimAlan);

        //double alan = pi * r * r;
        //double cevre = 2 * pi * r;
        //System.out.println("dairenin alani: "+ alan);
        //System.out.println("dairenin cevresi: "+ cevre);

    }
}