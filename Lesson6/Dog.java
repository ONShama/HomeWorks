public class Dog extends Animals{

    // name, count
    private String vid = "Dog";
    private int age;           // порода

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void run(double distance) {
        if (distance <= 500) {
            System.out.println("Dog " + getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println("Dog " + getName() + " хотел пробежать " + distance +  "м, но пробежал только 500.");
        }
    }
    public void swim(double distance) {
        if ( distance <= 10) {
            System.out.println("Dog " + getName() + " проплыл " + distance + "м.");
        } else {
            System.out.println("Dog " + getName() + " хотел проплыть  " + distance +  "м, но проплыл  только 10м.");
        }
    }
}

