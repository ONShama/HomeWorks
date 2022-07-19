public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println("Hello!");
        int a = 0;
        int b = 2;

        boolean isSum1020 = isSum1020(a, b);    // сумма чисел входит в интервал от 10 до 20
        System.out.println(isSum1020);

        isPositivOrNegativ(a);  // пишет число положительное или отрицательное

        boolean isNegativ = isNegativB(a);    //  является ли число отрицательным
        System.out.println(isNegativ);

        String line = "qwerty-фыва";
        int n = 5;
        printLineN (line, n);     // вывести на консоль строку n раз

        int year = 2400;
        boolean isVisYear = isVisokosYear( year);  // является ли год високосным
        System.out.println(isVisYear);
    }

    public static boolean isSum1020(int x,int y) {
        int sum = x + y;
        return  (sum >=10 && sum <= 20);
    }
    public static void isPositivOrNegativ(int x) {
        if ( x >=0 ) {
            System.out.println("Число положительное: " + x);
        } else {
            System.out.println("Число отрицательное: " + x);
        }
    }
    public static boolean isNegativB(int x) {
        return  !( x >=0 );
    }

    public static void printLineN (String line, int n) {
        for (int i = 0; i < n; i++) {
                System.out.println(line);
        }
    }

    public static boolean isVisokosYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if ( year % 400 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
