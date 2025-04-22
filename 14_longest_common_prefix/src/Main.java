import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (!Objects.equals(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl")) {
            throw new RuntimeException();
        }
        if (!Objects.equals(new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "")) {
            System.out.println("Erreur: " + new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
            throw new RuntimeException();
        }
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            final String firstWord = strs[0];
            final int firstWordLength = firstWord.length();
            for (int i = firstWordLength; i > 0; i--) {
                final String prefix = firstWord.substring(0, i);
                if (Arrays.stream(strs)
                        .allMatch(str -> str.startsWith(prefix))) {
                    return prefix;
                }
            }

            return "";
        }
    }
}