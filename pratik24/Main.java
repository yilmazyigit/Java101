import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int elmassinir;
        out.print("Kac satirlik elmas istiyorsunuz? : ");
        elmassinir = oku.nextInt();
        int satir=1,cizim=0;
        while(satir < elmassinir)
        {
            for(int k=0;k<(elmassinir-satir);k++)
                out.print(" ");
            for(int i=1; i < satir;i++)
                out.print("*");
            for(int i=1; i < satir;i++)
                out.print("*");
            out.print("\n");
            satir++;
        }
        while(satir > 0)
        {
            for(int k=0;k<(elmassinir-satir);k++)
                out.print(" ");
            for(int i=satir; i > 1;i--)
                out.print("*");
            for(int i=satir; i > 1;i--)
                out.print("*");
            out.print("\n");
            satir--;
        }
    }
}