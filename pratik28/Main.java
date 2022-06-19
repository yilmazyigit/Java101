import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,toplam=0, bolen=1;
        System.out.print("Lutfen bir sayi giriniz:");
        number = input.nextInt();
        for (int i=1; i<number;i++){
            if (number%i==0){
                bolen = i;
                toplam+= bolen;
            }
        }
        if (toplam == number) {
            System.out.println(number+ " bir mukemmel sayidir. toplam:"+toplam);
        }else{
            System.out.println(number+" bir mukemmel sayi degildir. toplam:"+toplam);
        }
    }
}