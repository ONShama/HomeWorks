public class HomeWorkApp  {


    public static void main(String[] args) {

        printThreeWords();
        checkSumSing ();
        PrintColor ();
        compareNumbers();
    }

    public static  void printThreeWords () {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple" + "\n");

    }
    public static void checkSumSing () {
        int a = 45;
        int b = 58;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void PrintColor () {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if ( a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
