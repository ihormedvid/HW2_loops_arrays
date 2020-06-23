package ua.com.operations.array;

import java.util.Arrays;
import java.util.Collections;


public class ArrayOperations {
    private static int[] arraysWithRandomNubmers = new int[20];

    public static void printCrateRandomNumber() {
        System.out.println("Crate Arrays with randoms Number: ");
        for (int i = 0; i < arraysWithRandomNubmers.length; i++) {
            arraysWithRandomNubmers[i] = (int) (Math.random() * 100);
            System.out.print(arraysWithRandomNubmers[i] + " ");
        }
        System.out.println();
    }

    public static void printFindMinimumElementArray() {
        System.out.println();
        int minElementOfArray = arraysWithRandomNubmers[0] + 1;
        System.out.print("Find Minimum Element of Array: ");

        for (int min = 0; min < arraysWithRandomNubmers.length; min++) {
            if (arraysWithRandomNubmers[min] < minElementOfArray) {
                minElementOfArray = arraysWithRandomNubmers[min];
            }
        }
        System.out.print(minElementOfArray);
        System.out.println();
    }

    public static void printFindMaximumElementArray() {
        System.out.println();
        int maxElementOfArray = arraysWithRandomNubmers[0] + 1;
        System.out.print("Find Maximum Element of Array: ");

        for (int max = 0; max < arraysWithRandomNubmers.length; max++) {
            if (arraysWithRandomNubmers[max] > maxElementOfArray) {
                maxElementOfArray = arraysWithRandomNubmers[max];
            }
        }
        System.out.print(maxElementOfArray);
        System.out.println();
    }

    public static void printSortAscending() {
        System.out.println();
        System.out.println("Sort Ascending: ");
        Arrays.sort(arraysWithRandomNubmers);
        for (int i = 0; i < arraysWithRandomNubmers.length; i++) {
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
        for (int sum = 0; sum < arraysWithRandomNubmers.length; sum++) {
            result += arraysWithRandomNubmers[sum];
        }
        System.out.println("Sum is " + result);
    }

    public static void printArraySquare() {
        System.out.println();
        System.out.println("Arrays Element Square: ");
        for (int sqr = 0; sqr < arraysWithRandomNubmers.length; sqr++) {
            arraysWithRandomNubmers[sqr] = (int) Math.pow(arraysWithRandomNubmers[sqr], 2);
            System.out.print(arraysWithRandomNubmers[sqr] + " ");
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
