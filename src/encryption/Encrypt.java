package encryption;

import utils.Utils;

import java.util.*;
import java.util.stream.IntStream;

// class that holds the encryption and decryption login
public class Encrypt {

    public Encrypt() {
    }


    // Encryption function with a text and a key
    public static int[] xorEncrypt(String inputString, String key) throws NullPointerException {
        // validate data:
        if (!Utils.isValid(inputString, key)) {
            return new int[]{-1};
        }

        int keyLen = key.length();
        return IntStream.range(0, inputString.length())
                .map(i -> Utils.getAsciiFromChar(inputString, i) ^ Utils.getAsciiFromChar(key, (i % keyLen)))
                .toArray();
    }


    // This method decrypt array of numbers with the  key to a text
    public static String xorDecrypt(int[] intputData, String key) throws NullPointerException {
        // validate data:
        if (!Utils.isValid(intputData, key)) {
            return "-1";
        }

        int keyLen = key.length();
        return IntStream.range(0, intputData.length)
                .mapToObj(i -> (char) (intputData[i] ^ Utils.getAsciiFromChar(key, i % keyLen)))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }


    // Decrypt integer array data based on the key length...
    public static String breakXOREncryption(int[] encryptedText, int keyLength) throws NullPointerException {
        // validate data:
        if (!Utils.isValid(encryptedText, keyLength)) {
            return "-1";
        }

        String bestKey = "";
        double bestScore = Double.NEGATIVE_INFINITY;

        // generate list of keys based on length
        List<String> keys = Utils.generateKeys(keyLength);

        // decrypt the data array on each key
        // then, update the score and find the most frequent
        for (String key : keys) {
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