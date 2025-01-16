import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static boolean findTriplet(int[] arr, int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == sum) {
                    return true;
                } else if (currentSum < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int sum = scanner.nextInt();

        boolean result = findTriplet(arr, sum);
        if (result) {
            System.out.println("There is a triplet with the given sum.");
        } else {
            System.out.println("No triplet found with the given sum.");
        }
    }
}
