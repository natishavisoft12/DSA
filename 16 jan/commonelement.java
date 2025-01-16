/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class commonelement {

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Input for the third array
        System.out.print("Enter the size of the third array: ");
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n3];
        System.out.print("Enter the elements of the third array: ");
        for (int i = 0; i < n3; i++) {
            arr3[i] = scanner.nextInt();
        }

        // Finding common elements
        List<Integer> result = findCommonElements(arr1, arr2, arr3);
        System.out.println("Common elements: " + result);
    }
}
