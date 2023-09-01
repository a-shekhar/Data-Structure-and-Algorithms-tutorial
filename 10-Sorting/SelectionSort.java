import java.util.Arrays;

public class SelectionSort {
    private String sort(int[] nums){
        int min_index = nums.length;
        for(int i= 0; i < nums.length; i++){
            min_index = i;
            for(int j= i+1; j < nums.length; j++){
                 if(nums[min_index] > nums[j]){
                     min_index = j;
                 }
            }
            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }

        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] nums = {4,7, 12, 2, 85, 21};
        System.out.println(obj.sort(nums));

        nums = new int[]{12, 15, 7, 6, 51, 43};
        System.out.println(obj.sort(nums));
    }
}
