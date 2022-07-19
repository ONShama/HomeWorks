import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static void main(String[] args) {
        System.out.println("Давай сыграем в Х и 0!");
        System.out.println("--------------------");
        String[][] field  =  initField(5);      // создали поле
        System.out.println("--------------------");

        boolean isWin = false;
        int count = 0;  // поле заполнится после 25 ходов, при этом 25 ход будет за human
        while (true) {
            humanMakeTurn(field);
            printField(field);
            count++;
            if (isWinner("X", field)) {
                System.out.println("Вы победили! Молодец! Ура!");
                break;
            }
            if (count == 25) {
                System.out.println("Ничья");
                break;
            }

            iiMakeTurn(field);
            printField(field);
            count++;
            if (isWinner("O", field)) {
                System.out.println("Победил машинный рандом. А Вы увы...");
                break;
            }
        }

    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = "*";
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
        return field;
    }
    public static String[][] printField(String[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
               System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        return field;
    }

    public static String[][] humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x >= 0 && x < field.length && y >= 0 && y < field.length) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Поле занято. Укажите другие значения от 1 до 5.");
                }
            } else {
                System.out.println("Вы вышли за пределы поля. Введите значения от 1 до 5");
            }
        }
        return field;
    }
    public static String[][] iiMakeTurn(String[][] field) {
        Random random = new Random();
        while(true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "O";
                break;
            }
        }
        return field;
    }
    public static boolean isWinner(String turn, String[][] field) {

        for (int i = 0; i < field.length; i++) {     // проверка по горизонтали
            if (field[i][1].equals(turn) && field[i][2].equals(turn) && field[i][3].equals(turn) &&
                    (field[i][0].equals(turn) || field[i][4].equals(turn))) {
               return true;
            }
        }
        for (int j = 0; j < field.length; j++) {     // проверка по вертикали
            if (field[1][j].equals(turn) && field[2][j].equals(turn) && field[3][j].equals(turn) &&
                    (field[0][j].equals(turn) || field[4][j].equals(turn))) {
               return true;
            }
        }
        // по диагоналям они начинаются в точках (0.0), (0.1), (0.3), (0.4), (1.0), (1.1), (1.3), (1.4)
        for (int i = 0; i < 2; i++) {       // берём 0, а потом 1 строку
            int[] jArr = {0, 1};            //диагональ идёт слева направо
            boolean isW;
            for (int m = 0; m < jArr.length; m++) {
                isW = true;
                int j = jArr[m];
                int k = 0;
                while (k < 4 && isW) {
                    if (field[i + k][j + k].equals(turn)) {
                        k++;
                    } else {
                        isW = false;
                    }
                }
                if (isW) {
                    return true;
                }
            }
            ///////////
            int[] jArr1 = {3, 4};            //диагональ идёт cправа налево
            for (int m = 0; m < jArr1.length; m++) {
                isW = true;
                int j = jArr1[m];
                int k = 0;
                while (k < 4 && isW) {
                    if (field[i + k][j - k].equals(turn)) {
                        k++;
                    } else {
                        isW = false;
                    }
                }
                if (isW) {
                    return true;
                }
            }
        }
        return false;
    }
}
