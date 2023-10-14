package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        // TODO: реализуйте вышеуказанную функцию

        // https://www.youtube.com/watch?v=7xZXHPF64n8
        // https://www.youtube.com/watch?v=xeUAsbyDCwo

        for (int i = 0; i < array.length / 2 ; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        // TODO: реализуйте вышеуказанную функцию
    }
}
