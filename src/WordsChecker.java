import java.util.*;

public class WordsChecker {
    protected String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord (String word) {
        if (set.contains(word)) {
            System.out.println("Содержит слово: " + word);
            return true;
        } else {
            System.out.println("Не содержит слова: " + word);
            return false;
        }

    }
}
