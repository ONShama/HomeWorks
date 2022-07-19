public class Main {
    public static void main(String[] args) {
        System.out.println("Наши достижения!");
        Cat cat1 = new Cat("Васька", "сибиряк");
        Dog dog1 = new Dog("Тузик", 10);

        cat1.run(30);
        cat1.swim(2000);
        dog1.run(100);
        dog1.swim(15);
        System.out.println(" Всего животных " + Animals.getCount());
    }
}
