import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, sifirlama, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adi: ");
        userName = input.nextLine();

        System.out.println("Sifre: ");
        password = input.nextLine();

        if (userName.equals("yigit1903") && password.equals("java1999")) {
            System.out.println("***Giris Basarili***");
        } else {
            System.out.println("Bilgileriniz yanlis! Sifreyi sifirlamak istiyor musunuz? (type YES/NO)");
            sifirlama = input.nextLine();

            if (sifirlama.equals("NO")) {
                System.out.println("***Giris Sonlandirildi***");
            } else if (sifirlama.equals("YES")) {
                System.out.println("Yeni sifreyi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword == password) {
                    System.out.println("Yeni sifreniz eskisiyle ayni olamaz");
                } else {
                    System.out.println("Sifreniz degistirildi.");
                }
            } else {
                System.out.println("Hatali secim");
            }
        }
    }
}