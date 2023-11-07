import java.util.Scanner;

//* 1) Эки класс тузунуз
//        * Apartment (title, price, address)
//        * Квартира( название, цена, адрес)
//        * Student ( fullName, phoneNumber, address, bankAccount)
//        * Студент (ФИО, номер телефона, адрес, банковский счет)
//        * 2) Apartment классына 2 обьект, Student классына
//        6 обьект
//        тузуп, алардын полелерин толтурунуз.
//        * (бир квартиранын жана 3 студенттин адрестери окшош болсун, экинчи квартиранын жана калган 3 студенттердин адрестери окшош болсун)
//        * 3)Студентерди озунчо массивге, квартираларды озунчо массивге салыныз.
//        * 4)Консольдон квартиранын адресин берсениз, ошол квартираны жана анда жашаган студенттерди консольго чыгарып берсин, ошол квартираны жана анда жашаган студенттерди консольго чыгара турганара турган метод тузунуз
//        * 5)Квартира классынын ичинде бир payPerMonth(Student[] students); деген методу болсун, ал метод ар бир студенке канча сомдон квартплата беруусун чыгарсын.
//        * 6)Студент классынын ичинде бир liveIn(Apartment apartment, Student[] students
//        ); деген метод болсун, ал метод студенттин капчыгына жараша ал квартирада канча ай жашай алуусун чыгарсын.
//        * 7)Студент классында дагы бир changeInfo(); деген метод болсун ал метод студенттин данныйларын озгортуп берсин
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerfor = new Scanner(System.in);
        Scanner scannerfor4 = new Scanner(System.in);

        Apartment apartment = new Apartment();
        apartment.setAdressOfApartmen("Asanbai");
        apartment.setNameOfApartmen("Emakom");
        apartment.setPriceOfApartmen(15000);

        Apartment apartment2 = new Apartment();
        apartment2.setAdressOfApartmen("Orto sai");
        apartment2.setNameOfApartmen("Avangard");
        apartment2.setPriceOfApartmen(20000);





        Student student6 = new Student("2grfdt4ergetrer", "0777485926", apartment2, 500450);

        Student student5 = new Student("2grfdgerdgreger", "0777485926", apartment2, 504500);
        Student student4 = new Student("2grfd67uyter", "0777485926", apartment2, 50004);
        Student student3 = new Student("2grfdekuyjhngfyjr", "0777485926", apartment2, 504500);
        Student student2 = new Student("2grfdehtrr", "0777485926", apartment2, 50050);
        Student student = new Student("2grfdehrtr", "0777485926", apartment2, 50);
//        student6.setFullName("Aijan Jylduzova");
//        student6.setApartment(apartment2);
//        student6.setBanky(500);
//        student6.setTelNumber("0777485926");

        Student [] allStudents = {student,student2,student3,student4,student5,student6};

        Apartment [] allApartments = {apartment,apartment2};

        Student[] allEmakomLifeStud = {student,student2,student3};


        Student[] allAvangardLifeStud = {student4,student5,student6};
        System.out.print("Write adress:  ");
        String adres = scanner.nextLine();
        if (adres.equalsIgnoreCase(apartment.getAdressOfApartmen())){
            for (Student wefe : allEmakomLifeStud) {
                System.out.println(wefe.getInfo());
            }

        } else if (adres.equalsIgnoreCase(apartment2.getAdressOfApartmen())) {
            for (Student ff : allAvangardLifeStud){
                System.out.println(ff.getInfo());
            }
        }
        System.out.println();
        apartment.oplataMonth(allEmakomLifeStud);
        System.out.println();
        apartment2.oplataMonth(allAvangardLifeStud);

        for (int i = 0; i < allEmakomLifeStud.length; i++) {
            allEmakomLifeStud[i].liveIn(apartment,allEmakomLifeStud);
        }
        System.out.println();
        for (int i = 0; i < allAvangardLifeStud.length; i++) {
            allAvangardLifeStud[i].liveIn(apartment,allAvangardLifeStud);
        }

        for (Student allStudent : allStudents) {
            System.out.println(allStudent.getInfo());
        }

//
//        for (Student allStudent : allStudents) {
//            if (name.equalsIgnoreCase(allStudent.getFullName())) {
//                System.out.print("Write fullname: ");
//                allStudent.setFullName(scannerfor.nextLine());
//                System.out.print("Write bank: ");
//                allStudent.setBanky(scanner.nextInt());
//                System.out.print("Write Tel NUmber: ");
//                allStudent.setTelNumber(scannerfor4.nextLine());
//            }
//        }
//        for (Student fsf : allStudents) {
//            System.out.println(fsf.getInfo());
//        }



        while (true) {
            System.out.println("UPDATEE!");
            System.out.print("Write name of Student:  ");
            String name = scannerfor4.nextLine();
            student.changeInfoForStudents(name,allStudents);
        }



    }
}