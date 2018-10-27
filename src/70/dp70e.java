package e70;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/*
 * Write a program that takes a filename and a parameter n and prints the n
 * most common words in the file, and the count of their occurrences, in
 * descending order.
 */
public class E70 {
    List<Word> words = new ArrayList<Word>();

    public E70() {
        Path fn = Paths.get(System.getProperty("java.class.path"), "e70", "input.txt");
        int n = 5;
        grabFile(fn);
        printHighest(n);
    }
    private void printHighest(int n) {
        Collections.sort(words);
        for (int i = 0; i < n; i++) {
            Word w = words.get(i);
            System.out.println(w +" was mention "+ w.getN() +" times.");
        }
    }

    private void grabFile(Path fn) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fn.toFile()));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(" ");
                for (String newWord: splitLine) {
                    newWord = strip(newWord);
                    boolean hasNewWord = false;
                    for (Word w : words) {
                        if (w.getWord().equals(newWord)) {
                            w.setN(w.getN() + 1);
                            hasNewWord = true;
                        }
                    }
                    if (!hasNewWord) {
                        words.add(new Word(newWord, 1));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String strip(String word) {
        StringBuilder stripMe = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            stripMe.append(word.charAt(matcher.start()));
        }
        return stripMe.toString();
    }

    public static void main(String[] args) {
        new E70();
    }
}


package e70;

public class Word implements Comparable<Word> {
    private String word;
    private Integer n;

    public Word(String word, Integer n) {
        this.word = word;
        this.n = n;
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public int compareTo(Word w) {
        int returnVal = n.compareTo(w.getN()) * -1;
        return returnVal;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}