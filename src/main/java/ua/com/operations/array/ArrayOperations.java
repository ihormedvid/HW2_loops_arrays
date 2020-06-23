package ua.com.operations.array;

import java.util.Arrays;
import java.util.Collections;


public class ArrayOperations {
    private static int[] arraysWithRandomNubmers = new int[20];

    public static void printCrateRandomNumber() {
        System.out.println("Crate Arrays with randoms Number: ");
        for (int i: arraysWithRandomNubmers) {
            arraysWithRandomNubmers[i] = (int) (Math.random() * 100);
            System.out.print(arraysWithRandomNubmers[i] + " ");
        }
        System.out.println();
    }

    public static void printFindMinimumElementArray() {
        System.out.println();
        int minElementOfArray = arraysWithRandomNubmers[0] + 1;
        System.out.print("Find Minimum Element of Array: ");

        for (int i: arraysWithRandomNubmers) {
            if (arraysWithRandomNubmers[i] < minElementOfArray) {
                minElementOfArray = arraysWithRandomNubmers[i];
            }
        }
        System.out.print(minElementOfArray);
        System.out.println();
    }

    public static void printFindMaximumElementArray() {
        System.out.println();
        int maxElementOfArray = arraysWithRandomNubmers[0] + 1;
        System.out.print("Find Maximum Element of Array: ");

        for (int i:arraysWithRandomNubmers) {
            if (arraysWithRandomNubmers[i] > maxElementOfArray) {
               maxElementOfArray = arraysWithRandomNubmers[i];
            }
        }
        System.out.println(maxElementOfArray);
    }

    public static void printSortAscending() {
        System.out.println();
        System.out.println("Sort Ascending: ");
        Arrays.sort(arraysWithRandomNubmers);

        for (int i:arraysWithRandomNubmers) {
            System.out.print(arraysWithRandomNubmers[i] + " ");
        }
    }

    public static void printSortDescending() {
        System.out.println();
        System.out.println("Sort Descending: ");

        int[] SortDescendingOfArray = Arrays.stream(arraysWithRandomNubmers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(x -> x)
                .toArray();
        System.out.print(Arrays.toString(SortDescendingOfArray));
        System.out.println();
    }

    public static void printArraySum() {
        System.out.println();
        int result = 0;
        for (int i:arraysWithRandomNubmers) {
            result += arraysWithRandomNubmers[i];
        }
        System.out.println("Sum is " + result);
    }

    public static void printArraySquare() {
        System.out.println();
        System.out.println("Arrays Element Square: ");
        for (int i:arraysWithRandomNubmers) {
            arraysWithRandomNubmers[i] = (int) Math.pow(arraysWithRandomNubmers[i], 2);
            System.out.print(arraysWithRandomNubmers[i] + " ");
        }
    }

    public static void printAllMethods() {
        printCrateRandomNumber();
        printFindMinimumElementArray();
        printFindMaximumElementArray();
        printSortAscending();
        printSortDescending();
        printArraySum();
        printArraySquare();
    }
}
