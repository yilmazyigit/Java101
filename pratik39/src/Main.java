import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Yıldayız?: ");
        int year = input.nextInt();

        Employee e1 = new Employee("Can Kan", 10000, 46, 2018, 2023);
        Employee e2 = new Employee("A B", 15000, 46, 2022, 2023);

        e1.printInfo();
        e2.printInfo();
    }
}