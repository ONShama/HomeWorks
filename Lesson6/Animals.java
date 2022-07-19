abstract public class Animals {
    private String vid;
    private String name;
    static int count;


    public Animals(String name) {
        this.name = name;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }
    abstract public void run(double distance);

    abstract public void swim(double distance);
}

