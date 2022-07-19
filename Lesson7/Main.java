public class Main {
    public static void main(String[] args) {
        System.out.println("Коты и котлеты");

        Cat cat1 = new Cat("Васька", 120);
        Cat cat2 = new Cat("Мяука", 100);
        Cat cat3 = new Cat("Барсик", 20);
        Cat cat4 = new Cat("Учёный", 10);
        Cat[] cats = {cat1, cat2, cat3, cat4};

        for (int i = 0; i < cats.length; i++){
            cats[i].info();
        }
        System.out.println("------------------------------------");

        Plate pl1 = new Plate(40);
        pl1.info();

        int j =0 ;  //  покормим котов
        while (j < cats.length) {
            cats[j].eat(pl1);
            j++;
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < cats.length; i++){
            cats[i].info();
        }
        System.out.println("------------------------------------");

        pl1.info();
        System.out.println("Добавим котлет в тарелку");
        pl1.increaseFood(200);   // добавим в тарелку еды
        pl1.info();
    }
}
