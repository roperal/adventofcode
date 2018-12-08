import java.util.List;

public class Day1 {
    public static final int START = 0;

    public int getFrequency(List<Integer> inputs) {
        int frequency = START;
        for (Integer input : inputs) {
            frequency += input;
        }
        return frequency;
    }
}
