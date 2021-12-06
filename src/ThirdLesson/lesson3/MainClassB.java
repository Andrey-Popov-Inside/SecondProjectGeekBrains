package ThirdLesson.lesson3;

import java.util.Arrays;

public class MainClassB {
    public static void main(String[] args) {

        String[] array = {"Tor", "Hulk", "IronMan", "BlackWidow", "CapitanAmerica"};
        doLesson_Array(array, 1,2);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }
    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}
