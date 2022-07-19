public class Main {
    public static void main(String[] args) {

        System.out.println("Сотрудники" );

        Employe[] employeeArr = new Employe[5];
        employeeArr[0] =  new Employe("Slava", "Engineer", "gb_slava@mail.ru",123_456_789,
                120_000, 24);

        employeeArr[1] = new Employe("Olga", "Engineer", "gb_olga@mail.ru",122_456_789,
                110_000, 27);

        employeeArr[2] = new Employe("Nikita", "Engineer", "gb_nikita@mail.ru",123_456_777,
                80_000, 42);

        employeeArr[3] = new Employe("Nina", "Engineer", "gb_nina@mail.ru",123_454_789,
                125_000, 56);

        employeeArr[4] = new Employe("Denis", "Engineer", "gb_denis@mail.ru",111_456_789,
                190_000, 70);


        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getAge() > 40) {
                employeeArr[i].printEmploye();
                System.out.println("---------------------------");
            }
        }
    }
}
