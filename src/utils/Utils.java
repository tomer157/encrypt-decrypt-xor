package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    // Utilities data methods
    public Utils() {
    }

    // extract the ascii-byte representation of a string
    public static int getAsciiFromChar(String text, int index) {
        return text.charAt(index);
    }

    // function that generate keys based on alpha-numeric basis.
    // We will use a statistic approach to fetch the data key.
    public static List<String> generateKeys(int length) {
        List<String> keys = new ArrayList<>();
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        generateKeysHelper("", length, chars, keys);
        return keys;
    }


    // Generate all possible keys
    public static void generateKeysHelper(String prefix, int length, char[] chars, List<String> keys) {
        if (length == 0) {
            keys.add(prefix);
            return;
        }
        for (char c : chars) {
            generateKeysHelper(prefix + c, length - 1, chars, keys);
        }
    }

    // map and utalize english letters frequency score and compare them to each decrypted key..
    public static double scoreText(String text) {
        // English letter frequency
        Map<Character, Double> freqs = new HashMap<>();
        freqs.put('a', 8.2);
        freqs.put('b', 1.5);
        freqs.put('c', 2.8);
        freqs.put('d', 4.3);
        freqs.put('e', 13.0);
        freqs.put('f', 2.2);
        freqs.put('g', 2.0);
        freqs.put('h', 6.1);
        freqs.put('i', 7.0);
        freqs.put('j', 0.15);
        freqs.put('k', 0.77);
        freqs.put('l', 4.0);
        freqs.put('m', 2.4);
        freqs.put('n', 6.7);
        freqs.put('o', 7.5);
        freqs.put('p', 1.9);
        freqs.put('q', 0.095);
        freqs.put('r', 6.0);
        freqs.put('s', 6.3);
        freqs.put('t', 9.1);
        freqs.put('u', 2.8);
        freqs.put('v', 0.98);
        freqs.put('w', 2.4);
        freqs.put('x', 0.15);
        freqs.put('y', 2.0);
        freqs.put('z', 0.074);
        freqs.put(' ', 13.0);

        double score = 0.0;
        for (char c : text.toCharArray()) {
            char lowerC = Character.toLowerCase(c);
            if (freqs.containsKey(lowerC)) {
                score += freqs.get(lowerC);
            } else {
                score -= 10;
            }
        }
        return score;
    }
}
