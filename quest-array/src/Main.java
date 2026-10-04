import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        assertResult(
                "BuildArray",
                Arrays.asList("Push", "Pop", "Push", "Push", "Pop", "Push"),
                new BuildArray().buildArray(new int[]{2, 4}, 5)
        );
        assertResult(
                "FindDisappearedNumbers",
                Arrays.asList(5, 6),
                new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})
        );
        assertResult(
                "FindErrorNums",
                new int[]{2, 3},
                new FindErrorNums().findErrorNums(new int[]{1, 2, 2, 4})
        );
        assertResult(
                "FindMaxConsecutiveOnes",
                3,
                new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})
        );
        assertResult(
                "SmallerNumbersThanCurrent",
                new int[]{4, 0, 1, 1, 3},
                new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})
        );
        assertResult(
                "ShuffleTheArray",
                new int[]{2, 3, 5, 4, 1, 7},
                new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)
        );
        assertResult(
                "ConcatenationOfArray",
                new int[]{1, 2, 1, 1, 2, 1},
                new ConcatenationOfArray().getConcatenation(new int[]{1, 2, 1})
        );
        System.out.println("Todos os exercícios testados passaram.");
    }

    private static void assertResult(String name, Object expected, Object actual) {
        if (!Objects.deepEquals(expected, actual)) {
            throw new AssertionError(name + ": esperado " + format(expected) + ", recebido " + format(actual));
        }
        System.out.println(name + ": OK");
    }

    private static String format(Object value) {
        if (value instanceof int[]) {
            return Arrays.toString((int[]) value);
        }
        return String.valueOf(value);
    }
}
