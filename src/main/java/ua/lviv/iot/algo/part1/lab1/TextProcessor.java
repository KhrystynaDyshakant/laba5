package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String text;

    private final String letter;

    public TextProcessor(final String textNeedToRedact, final String wordsStartWithLettersNeededToDelete) {
        this.text = textNeedToRedact;
        this.letter = wordsStartWithLettersNeededToDelete;
    }

    public final String getStringOfWordsFromText() {
        List<String> words = new ArrayList<>();
        String regex = "(?<=^|\\.)\\S+\\s+(" + letter + "\\S*)\\b";
        Pattern patternOfFoundingWords = Pattern.compile(regex);
        Matcher matcher = patternOfFoundingWords.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group(1));
        }

        return String.join(" ", words);
    }
    public static void main(final String[] args) {
     if (args.length < 2) {
            System.out.println("Usage: java Text <text> <letter>");
            return;
        }
        String text = args[0];
        String letter = args[1];

        TextProcessor texts = new TextProcessor(text, letter);
        String result = texts.getStringOfWordsFromText();
        System.out.println(result);
    }

}
