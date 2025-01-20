import java.util.Arrays;

public class Triplet {

   
    public static void threesum(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
          
            if (i > 0 && nums[i] == nums[i - 1]) continue;

              for (int j = i + 1; j < n - 1; j++) {
               
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

               
                for (int k = j + 1; k < n; k++) {
                   
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, -1, 2, -1, -4};
        threesum(arr); 
    }
}
