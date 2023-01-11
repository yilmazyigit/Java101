public class Employee {
    String name;
    String surName;
    int workHours;
    int hiredIn;
    int extraHour;
    int year;
    int salary;
    double raise;




    Employee(String name, int salary, int workHours, int hiredIn, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredIn = hiredIn;
        this.year = year;
    }

    double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary*0.03;
            return tax;
        } else {
            tax = 0;
            return tax;
        }
    }

    double bonus() {
        double bonus = 0;
        if (this.workHours > 40) {
            this.extraHour = this.workHours -40;
            bonus = this.extraHour *30;
            return bonus;
        }
        return bonus;
    }

    double raiseSalary() {
        if (this.year - this.hiredIn < 10) {
            this.raise = this.salary * 0.05;
            return this.raise;
        } else if ((this.year - this.hiredIn<20) && (this.year - this.hiredIn > 9)) {
            this.raise = this.salary * 0.1;
            return this.raise;
        } else if (this.year - this.hiredIn > 19) {
            this.raise = this.salary * 0.15;
            return this.raise;
        }
        return this.raise;
    }

    void printInfo() {
        System.out.println("#------------#");
        System.out.println("İsim: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hiredIn);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus:" + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar Sonucu Maaş: " + (this.salary+bonus()-tax()));
        System.out.println("Net Maaş: " + (this.salary+raiseSalary()));
    }


}

