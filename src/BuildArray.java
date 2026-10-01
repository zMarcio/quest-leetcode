import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildArray {
    static void main(String[] args) {
        int[] target = {2,4};
        int n = 5;

        List<String> listResult = new BuildArray().buildArray(target, n);

        System.out.println(listResult);

    }


    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        int[] aux = new int[n];

        for(int inTarget : target) {
            aux[inTarget-1]++;
        }

        System.out.println(Arrays.toString(aux));

        for(int i = 0; i < n; i++){
            list.add("Push");
            if (aux[i] != 1) {
                list.add("Pop");
            }

            if(i+1 == target[target.length-1]) break;
        }

        return list;
    }
}