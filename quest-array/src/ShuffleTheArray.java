import java.util.Arrays;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] numsSplit = Arrays.copyOfRange(nums, 0, n);
        int[] numsSplit2 = Arrays.copyOfRange(nums, n, nums.length);
        int[] result = new int[nums.length];

        for (int i = 0; i < numsSplit.length; i++) {
            result[2 * i] = numsSplit[i];
            result[2 * i + 1] = numsSplit2[i];
        }

        return result;
    }
}
