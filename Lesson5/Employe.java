public class Employe {

    private String name;
    private String profession;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employe(String name, String profession, String email, int phone, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmploye() {
        System.out.println("ФИО       : " +name +  "\n" + "Должность : " + profession + "\n" + "email     : " + email + "\n"
                + "phone     : " + phone + "\n" + "Зарплата  : " + salary + "\n" + "Возраст   : " + age);
    }
}

