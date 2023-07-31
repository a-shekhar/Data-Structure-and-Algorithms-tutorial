import java.util.Arrays;

public class MergeSortedArrays {

    public Integer[] sortedArray(Integer[] arr1, Integer[] arr2){
        if (arr1.length == 0){
            return arr2;
        }

        if (arr2.length == 0){
            return arr1;
        }

        int n = arr1.length + arr2.length;
        Integer[] result = new Integer[n];

        int i = 0;
        int j = 0;
        int index = 0;

        while(i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                result[index] = arr1[i];
                i++;
            } else{
                result[index] = arr2[j];
                j++;
            }
            index++;
        }

        while (i < arr1.length){
            result[index] = arr1[i];
            i++;
            index++;
        }

        while (j < arr2.length){
            result[index] = arr2[j];
            j++;
            index++;
        }

      return result;
    }

    public static void main(String[] args) {
       Integer[] arr1 = {0, 3, 24,31};
       Integer[] arr2 = {4, 23, 25};
       MergeSortedArrays obj = new MergeSortedArrays();
       Integer[] result = obj.sortedArray(arr1, arr2);
       System.out.println(Arrays.toString(result));
    }
}
