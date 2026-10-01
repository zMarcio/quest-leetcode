class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        String result = new ConcatenationOfArray().getConcatenation(nums);
        System.out.println(result);
    }

    public String getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        String resultInString = "";


        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        } 



        for(int i = 0; i < result.length; i++) {
            resultInString += result[i] + " ";
        }

        return resultInString;
    }
     
}
