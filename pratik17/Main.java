import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int limit = 0,sayilar = 0,toplam=0;
        out.print("Limit sayisini giriniz : ");
        limit = oku.nextInt();
        for(int i =1; i < limit ; i++)
        {
            if(i%3 == 0 && i%4 ==0) {
                sayilar += i;
                toplam++;
            }
        }

        out.print("Toplam " + toplam + " sayinin ortalamasi : " + (sayilar/toplam));
    }
}