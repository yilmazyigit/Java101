import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen n Degerinizi Giriniz :");
        int n=input.nextInt();
        double result=0;
        for(double i=1.0;i<=n;i++){
            result+=(1/i);
        }
        System.out.print(result+" Harmonik Sayisi");

    }

}