import java.util.Arrays;

public class InsertionSort {
    private String sort(int[] nums){
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] nums = {4,7, 12, 2, 85, 21};
        System.out.println(obj.sort(nums));

        nums = new int[]{12, 15, 7, 6, 51, 43};
        System.out.println(obj.sort(nums));
    }
}
