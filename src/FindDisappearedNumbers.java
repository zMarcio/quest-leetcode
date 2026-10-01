import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new FindDisappearedNumbers().findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] checkArray = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            System.out.println();
            checkArray[i]++;
        }

        for (int i = 1; i < checkArray.length; i++) {
            if(checkArray[i] == 0){
                result.add(i);
            }
        }

        return result;
    }
}
