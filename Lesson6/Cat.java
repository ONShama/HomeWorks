public class Cat extends Animals{
    // вид,
    String vid = "Cat";
    private String breed;           // порода

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void run(double distance) {
        if (distance <= 200) {
            System.out.println("Cat " + getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println("Кот " + getName() + " хотел пробежать " + distance +  "м, но пробежал только  200.");
        }
    }
    public void swim(double distance) {
        if ( distance > 0) {
            System.out.println("Кот " + getName() + " хотел проплыть " + distance +  "м, но остался на берегу.");
        }
    }
}

