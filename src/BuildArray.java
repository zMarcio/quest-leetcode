import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIndex = 0;

        for (int value = 1; value <= n && targetIndex < target.length; value++) {
            operations.add("Push");
            if (target[targetIndex] == value) {
                targetIndex++;
            } else {
                operations.add("Pop");
            }
        }

        return operations;
    }
}
