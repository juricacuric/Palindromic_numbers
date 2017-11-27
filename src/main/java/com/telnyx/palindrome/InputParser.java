package com.telnyx.palindrome;

public class InputParser {

    public static final int DEFAULT_SIZE = 1000;
    public static final String DEFAULT_RESULT_FILE = "result.csv";

    private final String[] args;
    private int maxNumber;
    private String resultFile;

    public InputParser(String[] args) {
        this.args = args;
        parse();
    }

    private void parse() {
        maxNumber = DEFAULT_SIZE;
        if (args != null && args.length >= 1) {
            maxNumber = parseMaxNumber(args[0]);
        }
        resultFile = DEFAULT_RESULT_FILE;
        if (args != null && args.length >= 2) {
            resultFile = args[1];
        }
    }

    private int parseMaxNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            return DEFAULT_SIZE;
        }
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public String getResultFile() {
        return resultFile;
    }
}
