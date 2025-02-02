package by.it.ithoitan.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static String[] words = new String[0];
    private static int[] counts = {};

    public static void main(String[] args) {
        String text = Poem.text;
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            process(word);
        }
        printResult();
    }

    public static void printResult() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s = %d\n", words[i], counts[i]);

        }
    }

    public static void process(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                counts[i]++;
                return;
            }
        }
        words = Arrays.copyOf(words, words.length + 1);
        counts = Arrays.copyOf(counts, counts.length + 1);
        words[words.length - 1] = word;
        counts[counts.length - 1] = 1;
    }

}
