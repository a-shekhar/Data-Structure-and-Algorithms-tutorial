import java.util.Arrays;

public class BubbleSort {
    public String sort(int[] nums){
        int temp;

        for(int i = 0 ; i < nums.length; i++){
            for (int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();

        int[] nums = {4,7, 12, 2, 85, 21};
        System.out.println(obj.sort(nums));

        nums = new int[]{12, 15, 7, 6, 51, 43};
        System.out.println(obj.sort(nums));

    }
}
