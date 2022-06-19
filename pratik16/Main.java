import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean leapYear = false;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yil girin: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    leapYear = true;
                }else{
                    leapYear = false;
                }
            }else {
                leapYear = true;
            }
        } else{
            leapYear = false;
        }

        if (leapYear){
            System.out.println(year + " yili bir artik yildir!");
        }else{
            System.out.println(year + " yili bir artik yil degildir !");
        }
    }
}