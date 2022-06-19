import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day;
        int month;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogdugunuz ay: ");
        month = scanner.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = scanner.nextInt();

        String burc = "";
        boolean isError = false;

        if (month == 1 && day >= 1 && day <= 31) {
            if (day <= 21) {
                burc = "Oglak Burcu";
            } else {
                burc = "Kova Burcu";
            }
        } else if (month == 2 && day >= 1 && day <= 29) {
            if (day <= 19) {
                burc = "Kova Burcu";
            } else {
                burc = "Balık Burcu";
            }
        } else if (month == 3 && day >= 1 && day <= 31) {
            if (day <= 20) {
                burc = "Balık Burcu";
            } else {
                burc = "Koc Burcu";
            }
        } else if (month == 4 && day >= 1 && day <= 30) {
            if (day <= 20) {
                burc = "Koc Burcu";
            } else {
                burc = "Boga Burcu";
            }
        } else if (month == 5 && day >= 1 && day <= 31) {
            if (day <= 21) {
                burc = "Boga Burcu";
            } else {
                burc = "Ikizler Burcu";
            }
        } else if (month == 6 && day >= 1 && day <= 30) {
            if (day <= 22) {
                burc = "Ikizler Burcu";
            } else {
                burc = "Yengeç Burcu";
            }
        } else if (month == 7 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Yengec Burcu";
            } else {
                burc = "Aslan Burcu";
            }
        } else if (month == 8 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Aslan Burcu";
            } else {
                burc = "Basak Burcu";
            }
        } else if (month == 9 && day >= 1 && day <= 30) {
            if (day <= 22) {
                burc = "Basak Burcu";
            } else {
                burc = "Terazi Burcu";
            }
        } else if (month == 10 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Terazi Burcu";
            } else {
                burc = "Akrep Burcu";
            }
        } else if (month == 11 && day >= 1 && day <= 30) {
            if (day <= 21) {
                burc = "Akrep Burcu";
            } else {
                burc = "Yay Burcu";
            }
        } else if (month == 12 && day >= 1 && day <= 31) {
            if (day <= 21) {
                burc = "Yay Burcu";
            } else {
                burc = "Oglak Burcu";
            }
        } else {
            isError = true;
        }
        if(isError) {
            System.out.println("Hatali giris yaptiniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}