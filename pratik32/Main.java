import java.util.Scanner;

public class Main {

    static boolean isPolindrome(int num) {
        int temp = num, reverseNum = 0, lastNum;

        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp = temp / 10;
        }
        if (num == reverseNum) {
            System.out.println("Polindrom sayidir");
            return true;
        } else {
            System.out.println("Polindrom sayi degildir.");
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n = input.nextInt();
        System.out.println(isPolindrome(n));
    }
}