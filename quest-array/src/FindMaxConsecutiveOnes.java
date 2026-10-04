public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int aux = 0;
        int seqValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 1) {
                aux = 0;
            } else {
                aux += 1;
            }

            if(aux > seqValue) {
                seqValue = aux;
            }
        }

        return seqValue;
    }
}
