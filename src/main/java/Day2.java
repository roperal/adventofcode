import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day2 {
    private static final int NUMBER_OF_2_REPETITIONS = 2;
    private static final int NUMBER_OF_3_REPETITIONS = 3;

    public int getChecksum(List<String> inputList) {
        return getNumberOfLettersThatRepeatNTimesInAWord(inputList, NUMBER_OF_2_REPETITIONS)
            * getNumberOfLettersThatRepeatNTimesInAWord(inputList, NUMBER_OF_3_REPETITIONS);
    }

    public int getNumberOfLettersThatRepeatNTimesInAWord(List<String> inputList, int numberOfRepetitions) {
        int count = 0;
        for (String word : inputList) {
            Set<String> characters = getCharacters(word);
            for (String character : characters) {
                if (StringUtils.countMatches(word, character) == numberOfRepetitions) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    public Set<String> getCharacters(String word) {
        Set<String> characters = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characters.add(word.substring(i, i + 1));
        }
        return characters;
    }
}
