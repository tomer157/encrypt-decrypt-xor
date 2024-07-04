package encryption;

import utils.Utils;

import java.util.*;
import java.util.stream.IntStream;


public class Encrypt {

    public Encrypt() {
    }

    // Encryption function with a text and a key
    public static int[] xorEncrypt(String inputString, String key) {
        int keyLen = key.length();
        return IntStream.range(0, inputString.length())
                .map(i -> getAsciiFromChar(inputString, i) ^ getAsciiFromChar(key, (i % keyLen)))
                .toArray();
    }


    // This method decrypt array of numbers and a key to a text
    public static String xorDecrypt(int[] intputData, String key) {
        int keyLen = key.length();
        return IntStream.range(0, intputData.length)
                .mapToObj(i -> (char) (intputData[i] ^ getAsciiFromChar(key, i % keyLen)))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }


    // Extract the ascii code from a character
    private static int getAsciiFromChar(String text, int index) {
        return text.charAt(index);
    }


    // Decrypt integer array data based on the key length...
    public static String breakXOREncryption(int[] encryptedText, int keyLength) {
        String bestKey = "";
        double bestScore = Double.NEGATIVE_INFINITY;

        // generate list of keys based on length
        List<String> keys = Utils.generateKeys(keyLength);

        //
        for (String key : keys) {
            // decrypt the data array on each key
            // then, update the score and find the most frequent
            String decrypted = xorDecrypt(encryptedText, key);
            double score = Utils.scoreText(decrypted);
            if (score > bestScore) {
                bestScore = score;
                bestKey = key;
            }
        }

        // lastly return the  class regular-decrypt method  string with the highest score key
        return xorDecrypt(encryptedText, bestKey);
    }


}