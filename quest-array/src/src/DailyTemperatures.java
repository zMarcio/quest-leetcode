package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> stackTemperature = new ArrayDeque<>();
        int countDay = 0;
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            if(!stackTemperature.isEmpty()){
                if(stackTemperature.peek() < temperatures[i]){
                    stackTemperature.pop();
                    result[i - 1] = 1
                }
            }
            stackTemperature.push(temperatures[i]);
        }

        return new int[] {1, 2};
    }
}
