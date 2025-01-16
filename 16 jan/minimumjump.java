import java.util.Scanner;

public class minimumjump {

    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < arr.length; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= arr.length - 1) {
                    return jumps;
                }
            }
        }

        return -1;
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

        int result = minJumps(arr);
        System.out.println("Minimum jumps required: " + result);
    }
}
