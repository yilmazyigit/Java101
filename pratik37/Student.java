import static java.lang.System.out;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int avagare;

    Student(String name,String stuNo,Course c1,Course c2,Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        out.println("Yeni ogrenci girisi yapildi.");
    }

    void notHesapla(int c1not1,int c1not2,int c2not1,int c2not2,int c3not1,int c3not2)
    {
        if(c1not1 > 0 && c1not1 < 100) {
            this.c1.note1 = c1not1;
            this.c1.note2 = c1not2;
        }

        if(c2not1 > 0 && c2not1 < 100) {
            this.c2.note1 = c2not1;
            this.c2.note2 = c2not1;
        }

        if(c3not1 > 0 && c3not1 < 100) {
            this.c2.note1 = c3not1;
            this.c2.note2 = c3not1;
        }

        ortalamaHesapla();
    }

    void ortalamaHesapla()
    {
        float c1ortalama = ((c1.note1 * c1.sozlu)/100) + ((c1.note2 * c1.sinav)/100);
        float c2ortalama = ((c2.note1 * c2.sozlu)/100) + ((c2.note2 * c2.sinav)/100);
        float c3ortalama = ((c3.note1 * c3.sozlu)/100) + ((c3.note2 * c3.sinav)/100);
        float toplam = (c1ortalama + c2ortalama + c3ortalama)/3;
        out.println("Ortalamaniz " + toplam);
    }


}