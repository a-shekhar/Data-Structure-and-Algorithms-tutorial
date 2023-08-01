import java.util.HashMap;
import java.util.Set;

public class FirstRecurringCharacter {

    private String firstRecurringCharacter(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i= 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                return "First duplicate key is " + arr[i] + ". Found at" +
                        " Index " + map.get(arr[i]) + " and " + i;
            } else{
                map.put(arr[i], i);
            }
        }
        return "No Recurring Character found.";
    }

    public static void main(String[] args) {
        FirstRecurringCharacter obj = new FirstRecurringCharacter();
        int[] arr1 = new int[]{2,5,1,2,3,5,1,2,4};
        System.out.println(obj.firstRecurringCharacter(arr1));

        int[] arr2 = new int[]{2,1,1,2,3,5,1,2,4};
        System.out.println(obj.firstRecurringCharacter(arr2));

        int[] arr3 = new int[]{2,3,4,5};
        System.out.println(obj.firstRecurringCharacter(arr3));
    }
}
