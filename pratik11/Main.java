import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input =new Scanner(System.in);
        System.out.println("Sicaklik Giriniz");
        sicaklik=input.nextInt();

        if (sicaklik <= 5) {
            System.out.println("Kayak yababilirsin");
        } else if ( sicaklik>5 && sicaklik<=15) {
            System.out.println(" Sinamaya gidebilirsin");
        } else if ( sicaklik>=15 && sicaklik<=25) {
            System.out.println("Piknige gidebilirsin");
        } else if ( sicaklik>=25) {
            System.out.println("Yuzmeye gidebilirsin");
        }
    }
}