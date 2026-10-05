package src;

import java.util.*;

public class ExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
//         "0:start:0","1:start:2","1:end:5","0:end:6"
        HashMap<Integer, Integer> hashList = new HashMap<>();
        int aux = 0;

        int index = Integer.parseInt(logs.getFirst().split(":")[0]);

        for (String i : logs) {
            if(Integer.parseInt(i.split(":")[0]) != index){
                aux += Integer.parseInt(i.split(":")[2]) - aux;
                hashList.put(index , aux);
                index = Integer.parseInt(i.split(":")[0]);
                aux = Integer.parseInt(i.split(":")[2]);
            } else {
                hashList.put(Integer.parseInt(i.split(":")[0]) , aux);
            }
        }

        System.out.println(hashList.toString());

        return new int[]{1,2};
    }
}
