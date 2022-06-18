import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("mat notu: ");
        mat = input.nextInt();

        System.out.println("fizik notu: ");
        fizik = input.nextInt();

        System.out.println("turkce notu: ");
        turkce = input.nextInt();

        System.out.println("kimya notu: ");
        kimya= input.nextInt();

        System.out.println("muzik notu: ");
        muzik = input.nextInt();

        if (mat<0 || mat>100) {
            mat = 0;
        }
        if (fizik<0 || fizik>100) {
            mat = 0;
        }
        if (kimya<0 || kimya>100) {
            mat = 0;
        }
        if (turkce<0 || turkce>100) {
            mat = 0;
        }
        if (muzik<0 || muzik>100) {
            mat = 0;
        }

        double ortalama = (mat+fizik+kimya+turkce+muzik)/5;
        if (ortalama<65) {
            System.out.println("Kaldin!");
        } else {
            System.out.println("Geçtin!");
        }
        System.out.println("ortalaman: "+ortalama);

    }
}