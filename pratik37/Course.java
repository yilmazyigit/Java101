import static java.lang.System.out;
public class Course {
    Teacher teacher;
    String name;
    int code;
    int sozlu;
    int sinav;

    int note1;
    int note2;

    Course(String name,int code,int sozlu,int sinav)
    {
        this.name = name;
        this.code = code;
        this.sozlu = sozlu;
        this.sinav = sinav;
    }

    void addTeacher(Teacher t)
    {
        if(this.code == t.branch) {
            this.teacher = t;
            out.println(this.name + " icin yeni hoca girisi");
        }
        else
            out.println("Bu hoca bu dersi veremez.");
    }

    void printTeacher()
    {
        out.println(teacher.name);
    }

}