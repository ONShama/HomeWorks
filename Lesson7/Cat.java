public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("Кот: " + name + "  Аппетит: " + appetite + "  Сытость: " + isSatiety);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        isSatiety = satiety;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public void eat(Plate pl) {
        if (appetite > pl.getFood()) {
            System.out.println("Коту " + name + " не хватило Котлет ( " + pl.getFood() + " ), а аппетит " + appetite);
        } else {
            pl.decreaseFood(appetite);
            isSatiety = true;
        }
    }
}
