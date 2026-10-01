import java.util.Arrays;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] repetidos = new int[nums.length];
        int faltante = 0;
        int repetido = 0;

        for (int numero: nums) {
            repetidos[numero - 1]++;
        }



        for (int i = 1; i <= nums.length; i++) {

            if(repetidos[i-1] == 0) {
                faltante = i;
            }


            if(repetidos[i-1] == 2){
                repetido = i;
            }

        }

        return new int[] {repetido, faltante};
    }

    public String toString(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append("índice ").append(i).append(" => ").append(nums[i]).append("\n");
        }
        return sb.toString();
    }
}
