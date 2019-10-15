package org.academiadecodigo.splicegirls36.wordhistogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogramComp implements Iterable<String> {

    String[] strings;
    private Map<String, Integer> words;

    WordHistogramComp(String string) {
        this.strings = string.split(" ");
        this.words = new HashMap<>(strings.length);
        for (String word: string.split(" ")) {
            words.put(word, words.containsKey(word) ? words.get(word) + 1 : 1);
        }
    }

    public int get(String word) {
        return words.get(word);
    }

    public int size() {
        return words.size();
    }

    @Override
    public Iterator<String> iterator() {
        return words.keySet().iterator();
    }
}
