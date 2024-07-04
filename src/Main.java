import java.util.*;
import encryption.Encrypt;

public class Main {
    public static void main(String[] args) {
        String inputString = "This is a wonder world please make it safe";
        String key = "abc";


        // Encrypt the text with a string key .
        int[] encryptedDataFromTxt = Encrypt.xorEncrypt(inputString, key);
        System.out.println("Encrypted: " + Arrays.toString(encryptedDataFromTxt));


        // Decrypt the previous integers array to a string
        String decryptedDataFromIntArray = Encrypt.xorDecrypt(encryptedDataFromTxt, key);
        System.out.println("Decrypted: " + decryptedDataFromIntArray);



        String extractedKey = Encrypt.breakXOREncryption(encryptedDataFromTxt, key.length());
        System.out.println("Extracted key from array and key length: " + extractedKey);

    }


}












