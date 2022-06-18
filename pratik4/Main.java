import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perKm = 2.20;
        double acilis = 10;

        Scanner input =  new Scanner(System.in);
        System.out.println("Km cinsinden mesafe: ");
        double km = input.nextInt();

        double ucret = km*perKm+acilis;

        if (ucret<=20) {
            System.out.println("ucret: "+20);
        } else if (ucret>20) {
            System.out.println(ucret);

        }
    }
}