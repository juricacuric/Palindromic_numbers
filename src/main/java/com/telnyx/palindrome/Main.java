package com.telnyx.palindrome;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        InputParser inputParser = new InputParser(args);
        final int maxNumber = inputParser.getMaxNumber();
        final String resultFile = inputParser.getResultFile();

        BaseConverter baseConverter = new BaseConverter(maxNumber);
        PalindromeRunner palindromeRunner = new PalindromeRunner(maxNumber, baseConverter);
        String result = palindromeRunner.run();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
            writer.write(result);
        } catch (Exception e) {
            throw new RuntimeException("An exception occurred while writing result to file! ", e);
        }
    }
}
