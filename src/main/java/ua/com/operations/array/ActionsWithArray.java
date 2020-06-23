package ua.com.operations.array;

public class ActionsWithArray {

    public static void printChangeZero() {
        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Result ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
