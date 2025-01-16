import java.util.Scanner;

public class rainwatertrap{

    
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int waterTrapped = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] height = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        
        int result = trap(height);
        
       
        System.out.println("Amount of water trapped: " + result);
    }
}
