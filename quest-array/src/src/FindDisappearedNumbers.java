package src;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] checkArray = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
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
