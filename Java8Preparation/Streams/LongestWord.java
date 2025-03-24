import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java 8 streams are powerful and concise";

        String longestWord = Arrays.stream(sentence.split(" "))
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse(null);

        System.out.println(longestWord); // "powerful"
    }
}
