import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Student {

    private String fullName;
    private String telNumber;
    private Apartment apartment;
    private int banky;

    public Student() {
    }

    public Student(String fullName, String telNumber, Apartment apartment, int banky) {
        this.fullName = fullName;
        this.telNumber = telNumber;
        this.apartment = apartment;
        this.banky = banky;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public int getBanky() {
        return banky;
    }

    public void setBanky(int banky) {
        this.banky = banky;
    }

    public String getInfo() {
        return STR. "Full  name: \{ getFullName() } | Telephone : \{ getTelNumber() }()} | Aparment: \{ getApartment().getNameOfApartmen() } | Banky: \{ getBanky() }" ;
    }

    public void liveIn(Apartment apartment, Student[] students) {
        int res = apartment.getPriceOfApartmen() / students.length;
        System.out.println(getFullName() + "  |  " + (getBanky()) / res);
    }

    public void changeInfoForStudents(String name, Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanFor = new Scanner(System.in);
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.getFullName())) {
                System.out.print("Write fullname: ");
                student.setFullName(scanner.nextLine());
                System.out.print("Write bank: ");
                student.setBanky(scanFor.nextInt());
                System.out.print("Write Tel NUmber: ");
                student.setTelNumber(scanner.nextLine());
            }
        }
        for (Student fsf : students) {
            System.out.println(fsf.getInfo());
        }

    }
}