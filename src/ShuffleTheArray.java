import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleTheArray {
    static void main(String[] args) {
        // nums = [2,5,1,3,4,7], n = 3
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] numsSplit = Arrays.copyOfRange(nums, 0, n);
        int[] numsSplit2 = Arrays.copyOfRange(nums, n, nums.length);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numsSplit.length; i++) {
            result.add(numsSplit[i]);
            result.add(numsSplit2[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
