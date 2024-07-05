import java.util.*;

import encryption.Encrypt;

import java.lang.AssertionError;

public class Main {
    public static void main(String[] args) {
        // Basic examples
        String inputString = "This is a wonder world please make it safe";
        String key = "abc";

        // Encrypt the text with a string key .
        int[] encryptedDataFromTxt = Encrypt.xorEncrypt(inputString, key);
        System.out.println("Encrypted: " + Arrays.toString(encryptedDataFromTxt));


        // Decrypt the previous integers array to a string
        String decryptedDataFromIntArray = Encrypt.xorDecrypt(encryptedDataFromTxt, key);
        System.out.println("Decrypted: " + decryptedDataFromIntArray);

        // Decrypt encrypted numbers array with a key length
        String[] extractedKeys = Encrypt.breakXOREncryption(encryptedDataFromTxt, key.length());
        System.out.println("Decrypt by key length to original string: " + Arrays.asList(extractedKeys));

        // Sanity test cases
        test1();
        test2();
        test3();
        test4();
        test5();

    }


    private static void test1() {
        String inputString = "This is a wonder world please make it safe";
        String key = "abc";
        int[] expectedData = new int[]{53, 10, 10, 18, 66, 10, 18, 66, 2, 65, 21, 12, 15, 6, 6, 19, 66, 20, 14, 16, 15, 5, 66, 19, 13, 7, 2, 18, 7, 67, 12, 3, 8, 4, 66, 10, 21, 66, 16, 0, 4, 6};

        // Encrypt the text with a string key .
        int[] encryptedDataFromTxt = Encrypt.xorEncrypt(inputString, key);


        try {
            // Check if encryptedDataFromTxt equals expectedData
            if (!Arrays.equals(encryptedDataFromTxt, expectedData)) {
                throw new AssertionError("test 1 Encryption and decryption failed!");
            }
            System.out.println("Test 1 passed");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());

        }
    }

    private static void test2() {

        String inputStringData = "This is a wonder world please make it safe";
        int[] expectedData = new int[]{53, 10, 10, 18, 66, 10, 18, 66, 2, 65, 21, 12, 15, 6, 6, 19, 66, 20, 14, 16, 15, 5, 66, 19, 13, 7, 2, 18, 7, 67, 12, 3, 8, 4, 66, 10, 21, 66, 16, 0, 4, 6};

        String key = "abc";

        String decryptedDataFromIntArray = Encrypt.xorDecrypt(expectedData, key);


        try {
            // Check if encryptedDataFromTxt equals expectedData
            if (!decryptedDataFromIntArray.equals(inputStringData)) {
                throw new AssertionError("test 2 Encryption and decryption failed!");
            }
            System.out.println("Test 2 passed");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());

        }
    }

    private static void test3() {
        // negative test
        String inputString = "";
        String key = "abc";

        // Encrypt the text with a string key .
        int[] encryptedDataFromTxt = Encrypt.xorEncrypt(inputString, key);

        try {
            if (encryptedDataFromTxt[0] == -1) {
                throw new AssertionError("test 3 passed");
            }

            System.out.println("test 3 Encryption and decryption failed!");

        } catch (AssertionError e) {
            System.out.println(e.getMessage());

        }
    }


    private static void test4() {

        try {
            String inputStringData = "";
            int[] expectedData = new int[]{53, 10, 10, 18, 66, 10, 18, 66, 2, 65, 21, 12, 15, 6, 6, 19, 66, 20, 14, 16, 15, 5, 66, 19, 13, 7, 2, 18, 7, 67, 12, 3, 8, 4, 66, 10, 21, 66, 16, 0, 4, 6};

            String key = "";

            String decryptedDataFromIntArray = Encrypt.xorDecrypt(expectedData, key);

            // Check if encryptedDataFromTxt equals expectedData.
            if (!decryptedDataFromIntArray.equals(inputStringData)) {
                throw new AssertionError("test 4 passed");
            }

            System.out.println("test 4 Encryption and decryption negative failed!");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());

        }
    }

    private static void test5() {
        try {
            String[] extractedKeys = Encrypt.breakXOREncryption(new int[]{}, 4);
            if (extractedKeys[0].equals("-1")) {
                System.out.println("test 5 passed");
            } else {
                System.out.println("test 5 failed");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}












