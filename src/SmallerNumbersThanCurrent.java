public class SmallerNumbersThanCurrent {
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
