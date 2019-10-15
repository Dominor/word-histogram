package org.academiadecodigo.splicegirls36.wordhistogram;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramComp implements Iterable<String> {

    String[] strings;
    private HashMap<String, Integer> words;

    WordHistogramComp(String string) {
        this.strings = string.split(" ");
        this.words = new HashMap<>(strings.length);
        init();
    }

    void init() {
        int count = 1;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (j == i) {
                    continue;
                }
                if (strings[i] == strings[j]) {
                    count++;
                }
            }
            words.put(strings[i], count);
            //count = 1;
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
