import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        arrChanch101();      // массив, меняем 0 на 1, а 1 на 0
        arr100();        // массив от 1 до 100
        arrMultiply2();    // числа < 6 умножаем на 2
        arrDiagonal();     // по диагоналям 1

        arrInitialValue(15, 122) ;     // возвращаем  одномерный массив
        arrMinMax();  //        найти мин и макс элементы

        int[] arrSdvig = {3, 5, 6, 1, 7, 8, 4, 9, 0};       // сдвиг элементов массива на n
        int n = -7;
        for(int k = 0; k < arrSdvig.length; k++) {
            System.out.print(arrSdvig[k] + " ");
        }
        System.out.println();
        arrSdvigN( arrSdvig, n );
    }

    public static void arrChanch101() {

        int n = 10;
        int[] arr01 = new int[n];
        Random random = new Random();       //заполним массив случайным образом
        for (int i = 0; i < arr01.length; i++) {
            arr01[i] = random.nextInt(2);
            System.out.print(arr01[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < arr01.length; j++) {
            if(arr01[j] == 0) {
                arr01[j] = 1;
            } else if (arr01[j] == 1) {
                arr01[j] = 0;
            }
            System.out.print(arr01[j] + " ");
        }
        System.out.println();
    }

    public static void arr100() {
        int[] arr100 = new int[100];
        for(int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
            System.out.print(arr100[i] + " ");
        }
        System.out.println();
    }

    public static void arrMultiply2() {

        int[] arrMultyply  =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrMultyply.length; i++) {
            System.out.print(arrMultyply[i] + " ");
            if(arrMultyply[i] < 6) {
                arrMultyply[i] *=2;
            }
            System.out.println(arrMultyply[i] );
        }
    }

    public static void arrDiagonal() {
        int[][]  arrDiagonal = new int[7][7];
        for (int i = 0; i < arrDiagonal.length; i++) {
            for(int j = 0; j < arrDiagonal.length; j++) {
                if ((i == j) || (i + j) == arrDiagonal.length - 1) {
                    arrDiagonal[i][j] = 1;
                }
                System.out.print(arrDiagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrInitialValue(int len, int initialValue) {
        int[] arrInitialValue = new int[len];
        for(int i = 0; i < arrInitialValue.length; i++) {
            arrInitialValue[i] = initialValue;
            System.out.print(arrInitialValue[i] + " ");
        }
        System.out.println();
        return arrInitialValue;
    }

    public static void arrMinMax() {
        int[] arrMinMax = new int[12];
        Random random = new Random();       // заполним массив случайным образом
        for(int i = 0; i < arrMinMax.length; i++) {
            arrMinMax[i] = random.nextInt(100);
            System.out.print(arrMinMax[i] + " ");
        }
        System.out.println();

        int miniArr = arrMinMax[0];
        int maxArr = arrMinMax[0];
        for(int i = 1; i < arrMinMax.length; i++) {
            if (arrMinMax[i] < miniArr) {
                miniArr = arrMinMax[i];
            } else if (arrMinMax[i] > maxArr) {
                maxArr = arrMinMax[i];
            }
        }
        System.out.println("Min = " + miniArr + "     Max = " + maxArr);
    }


    public static void arrSdvigN(int[] arrSdvig, int n ) {
        if (n < 0) {                //  двигая на  -1 (влево), всё равно, что на   (arrSdvig.length -1) (вправо)
            n = arrSdvig.length + ( n % arrSdvig.length);
        }

        if ( n == 0  ||  arrSdvig.length == n  ||  n % arrSdvig.length == 0) {
             // ничего не изменилось
            for(int k = 0; k < arrSdvig.length; k++) {
                System.out.print(arrSdvig[k] + " ");
            }
            System.out.println();

        } else {
            if (n > arrSdvig.length) {
                n = n % arrSdvig.length;
            }

            int in = 0;
            int a = arrSdvig[0];
            int b ;

            if (n == 1  || arrSdvig.length % n != 0) {

                int noCycle = 0;
                for (int count = 0; count < arrSdvig.length; count++) {
                    in = (in + n) % arrSdvig.length;
                    b = arrSdvig[in];
                    arrSdvig[in] = a;
                    a = b;

                    if(in == noCycle) {
                        noCycle++;
                        in++;
                        a = arrSdvig[in];
                    }

                }
            } else {            // когда длина массива делится на n без остатка
                int m = arrSdvig.length / n;   // за один цикл m замен

                for ( int k = 0; k < n; k++) {
                    a = arrSdvig[k];
                    in = k;
                    for (int count = 0; count < m; count++) {
                        in = (in + n) % arrSdvig.length;
                        b = arrSdvig[in];
                        arrSdvig[in] = a;
                        a = b;

                    }

                }
            }

            for(int kp = 0; kp < arrSdvig.length; kp++) {
                System.out.print(arrSdvig[kp] + " ");
            }
            System.out.println();
        }


    }
}
