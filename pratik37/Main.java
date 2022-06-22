import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Bora",001,555);
        Teacher t2 = new Teacher("Ahmet",002,555);
        Teacher t3 = new Teacher("Mehmet",003,555);

        Course c1 = new Course("Tarih",001,20,80);
        Course c2 = new Course("Matematik",002,30,70);
        Course c3 = new Course("Kimya",003,60,40);

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("İlker Bora","ab12",c1,c2,c3);
        s1.notHesapla(20,90,80,30,60,45);


    }
}