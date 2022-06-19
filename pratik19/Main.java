import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi Girin");
        int sayi=sc.nextInt();

        System.out.print( sayi+ " sayisindan kucuk dordun kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " sayisindan kucuk besin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }

    }
}