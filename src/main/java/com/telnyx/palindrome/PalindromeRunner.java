package com.telnyx.palindrome;

public class PalindromeRunner {

    private final int maxNumber;
    private final BaseConverter baseConverter;

    public PalindromeRunner(int maxNumber, BaseConverter baseConverter) {
        this.maxNumber = maxNumber;
        this.baseConverter = baseConverter;
    }

    public String run() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= maxNumber; i++) {
            int minimumBase = getMinPalindromeBase(i);
            result.append(i).append(", ").append(minimumBase).append(System.lineSeparator());
        }
        return result.toString();
    }

    public boolean isPalindrome(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        String reversedNumber = new StringBuilder(number).reverse().toString();
        return reversedNumber.equals(number);
    }

    public int getMinPalindromeBase(int number) {
        for (int i = 2; i <= maxNumber; i++) {
            String numberInBaseI = baseConverter.convert(number, i);
            if (isPalindrome(numberInBaseI)) {
                return i;
            }
        }
        return -1;

    }
}
