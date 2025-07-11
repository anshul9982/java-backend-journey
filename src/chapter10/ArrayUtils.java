package chapter10;

import java.util.Arrays;

public class ArrayUtils {
    
    public static <T> void swap(T[] array, int index1, int index2){
        if ((index1>=0&&index1<array.length)&&(index2>=0&&index2<array.length)) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arrrayStrings = {"one", "two", "three", "four", "five"};

        System.out.println(Arrays.toString(arrrayStrings));
        swap(arrrayStrings, 0, 4);
        System.out.println(Arrays.toString(arrrayStrings));
    }

}
