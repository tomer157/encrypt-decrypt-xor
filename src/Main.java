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

        int[] sample = new int[]{46,14,14,1,79,15,8,79,43,30,7,15,12,10,14,67,79,49,2,2,7,77,22,7,12,29,17,77,14,5,2,66,79,3,10,20,8,29,66,0,6,12,9,79,10,2,24,66,1,0,12,10,79,18,31,10,1,4,28,7,1,22,79,64,7,3,27,6,12,10,79,14,4,27,22,1,10,66,2,29,66,3,0,66,0,0,12,8,22,66,4,1,66,0,22,66,29,26,16,30,10,78,77,14,12,9,79,12,2,27,10,4,1,5,77,31,3,31,27,11,14,26,14,12,29,66,25,0,66,4,1,22,8,29,7,30,27,66,0,10,66,2,1,66,30,7,13,31,10,78,77,38,66,25,7,13,24,8,10,25,79,43,77,24,13,24,3,6,77,28,3,4,3,66,12,13,13,24,27,66,12,79,14,4,27,22,1,10,66,12,1,6,77,28,7,8,79,22,5,10,66,26,14,22,8,29,27,77,31,3,31,27,66,2,9,66,25,7,7,77,24,13,31,3,6,67,79,43,25,79,11,30,79,3,77,24,3,20,79,43,77,7,3,27,10,66,2,9,66,9,29,11,27,6,12,10,79,13,11,9,66,25,7,7,77,28,18,1,10,7,3,79,3,3,11,66,31,10,5,24,3,3,25,6,12,10,79,22,5,10,66,14,6,16,14,26,14,12,27,11,2,1,76,77,56,10,8,1,7,27,10,16,77,38,66,11,6,12,9,79,15,20,28,7,1,9,66,10,29,13,26,6,12,10,79,5,31,6,15,77,14,0,2,26,22,77,27,10,8,79,15,2,26,22,5,84,66,26,7,7,3,10,20,8,29,66,4,27,66,4,28,66,12,79,6,12,2,18,65,79,6,31,6,24,23,3,27,77,33,13,27,10,15,15,10,16,77,6,12,77,2,27,77,28,13,24,3,89,77,24,10,8,1,7,27,10,16,77,38,66,11,6,12,9,79,15,20,28,7,1,9,66,4,1,20,2,3,23,3,27,3,31,6,14,20,79,18,12,26,17,4,1,5,77,13,7,11,0,16,8,79,1,2,9,4,4,1,66,26,14,16,8,7,13,24,28,7,30,67,66,12,1,6,77,13,16,4,1,5,4,1,5,77,26,18,77,27,10,8,79,16,8,14,16,77,0,4,77,10,20,8,29,27,77,9,23,3,10,16,12,3,66,36,79,15,8,10,22,86,79,3,3,11,66,8,28,18,8,12,11,12,3,14,20,79,21,5,10,12,8,25,7,31,79,15,20,79,10,20,31,13,30,79,5,8,27,66,30,26,1,5,79,3,3,79,23,29,31,7,31,79,10,12,1,6,77,0,4,77,2,7,65,79,22,5,14,22,77,6,22,77,29,7,28,26,11,31,10,17,77,14,66,30,27,16,2,1,5,77,2,13,31,14,14,77,31,16,4,1,1,4,31,14,8,79,22,2,79,18,31,10,20,8,1,22,77,2,7,77,9,16,2,2,66,9,10,14,4,13,7,31,14,22,8,3,27,77,28,22,8,31,18,4,1,5,77,6,12,25,0,66,25,7,7,77,28,22,31,10,7,25,67,66,12,1,6,77,2,7,25,7,13,9,6,1,12,3,14,20,79,9,3,0,1,6,6,12,10,79,18,8,0,18,1,10,69,30,79,10,12,27,17,77,0,4,11,66,79,25,7,7,3,67,66,36,79,3,14,12,13,24,1,22,77,6,22,77,7,11,10,7,66,25,6,15,8,79,22,2,79,5,8,27,66,25,0,66,30,10,3,77,14,17,77,28,13,2,1,66,12,28,66,36,79,1,12,1,76,77,59,10,4,28,66,4,28,66,0,22,66,30,26,0,30,27,11,25,26,22,8,79,4,2,29,66,29,6,17,25,0,14,77,14,12,9,79,0,12,3,14,67,79,53,4,27,10,77,14,66,29,7,11,1,0,17,2,31,10,4,12,3,1,79,4,1,0,23,31,6,17,5,79,33,12,27,13,77,27,10,31,0,21,30,79,10,4,2,17,8,3,4,77,26,18,2,1,66,5,6,17,77,28,21,2,29,6,86,79,43,77,30,23,4,10,22,1,22,66,25,14,9,8,79,22,2,79,22,5,10,66,30,7,11,29,65,66,57,7,7,31,10,66,4,28,66,3,0,22,5,6,12,10,79,17,24,29,18,31,6,17,4,1,5,77,6,12,77,27,10,4,28,76,77,38,4,77,27,10,8,22,66,15,26,22,77,4,12,8,24,66,4,27,78,77,14,14,0,0,17,25,79,3,1,3,66,0,10,12,77,6,12,77,27,10,8,6,16,77,11,7,10,29,7,8,67,66,30,0,15,8,79,22,4,2,7,77,0,16,77,0,22,5,10,16,65,79,1,5,10,16,4,28,10,77,25,7,31,22,66,3,10,3,31,3,27,77,27,10,8,79,17,12,2,7,77,9,7,8,3,11,3,8,17,77,27,13,26,14,16,9,28,66,25,7,7,77,0,1,8,14,12,77,24,11,25,7,66,0,10,76};

        // Decrypt encrypted numbers array with a key length ->  return array with the re-decrypted text and the key text.
        String[] extractedKeys = Encrypt.breakXOREncryption(sample, 3);
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












