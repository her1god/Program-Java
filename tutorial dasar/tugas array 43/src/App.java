import java.util.*;
/**
 * App
 */
public class App {

    public static void main(String[] args) {
        System.out.println("\n-----Tugas-----\n1. Sort tebalik\n2. operasi tambah antara 2 buah array\n3. menghubungkan 2 buah array");
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = {9,4,3,2,5};

        reverseSorting(arrayAngka1);

        additionTwoArray(arrayAngka1, arrayAngka2);

        mergeTwoArray(arrayAngka1, arrayAngka2);

    }


    // Method sorting array secara terbalik

    private static void reverseSorting(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[(array.length - (i + 1))];
        }
        System.out.println(Arrays.toString(newArray));
    }


    // Method operasi tambah dua array

    private static void additionTwoArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = (array1[i] + array2[i]);
        }
        System.out.println(Arrays.toString(newArray));
    }
    

    // Method menggabungkan 2 array menjadi satu array baru

    private static void mergeTwoArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0; i < (array1.length + array2.length); i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else if(i >= array2.length) {
                newArray[i] = array2[(i - array2.length)];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}