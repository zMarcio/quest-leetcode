package src;

import java.util.Arrays;

public class FinalPrices {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int rightLower = calcValue(i + 1, prices, prices[i]);
            result[i] = prices[i] - rightLower;
        }
        return result;
    }

    public int calcValue(int i, int[] j, int value) {
        for (int k = i; k < j.length; k++) {
            if(value >= j[k]){
                return j[k];
            }
        }
        return 0;
    }

}
