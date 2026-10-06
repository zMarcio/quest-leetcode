package src;

import java.util.*;

public class ExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
//
//        "0:start:0","1:start:2","1:end:5","0:end:6"
//        "0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"

        Deque<Integer> idFila = new ArrayDeque<>();
        int prev = 0;
        int[] result = new int[n];

        for (String i : logs){
            if(Objects.equals(i.split(":")[1], "start")) {
                if(!idFila.isEmpty()) {
                    result[idFila.peek()] += Integer.parseInt(i.split(":")[2]) - prev;
                }
                prev = Integer.parseInt(i.split(":")[2]);
                idFila.push(Integer.parseInt(i.split(":")[0]));
            } else {
                int idTopo = idFila.pop();
                result[idTopo] += Integer.parseInt(i.split(":")[2]) - prev + 1;
                prev = Integer.parseInt(i.split(":")[2]) + 1;
            }
        }
        return result;
    }
}
