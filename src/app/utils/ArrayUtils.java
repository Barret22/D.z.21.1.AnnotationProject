package app.utils;

import app.annotations.MethodInfo;
import app.annotations.Author;

public class ArrayUtils {

    @MethodInfo(name = "sum", returnType = "int", description = "Обчислює суму елементів масиву")
    @Author(firstName = "Іван", lastName = "Ковальчук")
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @MethodInfo(name = "max", returnType = "int", description = "Знаходить максимальний елемент у масиві")
    @Author(firstName = "Марія", lastName = "Петренко")
    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
