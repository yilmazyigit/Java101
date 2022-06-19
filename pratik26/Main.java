import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int sayi1 = 0,sayi2 = 0,buyuk,bolen = 1,ebob=1,ekok=1;

        out.print("Hesaplanacak Sayi-1 Giriniz : ");
        sayi1 = oku.nextInt();

        out.print("Hesaplanacak Sayi-2 Giriniz : ");
        sayi2 = oku.nextInt();

        if(sayi1 > sayi2)
            buyuk = sayi1;
        else
            buyuk = sayi2;


        while(bolen < buyuk)
        {
            if((sayi1 % bolen == 0) && (sayi2 % bolen == 0))
                ebob = bolen;
            bolen++;
        }

        ekok = (sayi1*sayi2)/ebob;
        out.print("Iki sayinin ebobu : "+ ebob + " ve Ekok : " + ekok);

    }
}