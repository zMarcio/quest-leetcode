import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {

    static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int aux = 0;
        int i = 0;
        int[] result = new int[nums.length];

        while(aux < nums.length) {
            if (nums[i] < nums[aux]) {
                result[aux]++;
            }
            i++;
            if(i == nums.length){
                i = 0;
                aux++;
            }
        }


        return result;
    }


}
