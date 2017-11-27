package com.telnyx.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeRunnerTest {

    @Test
    public void testMinimumPalindromeAgainstGivenExampleOutput() {
        PalindromeRunner palindromeRunner = new PalindromeRunner(20, new BaseConverter(20));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(1));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(2));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(3));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(4));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(5));
        Assert.assertEquals(5, palindromeRunner.getMinPalindromeBase(6));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(7));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(8));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(9));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(10));
        Assert.assertEquals(10, palindromeRunner.getMinPalindromeBase(11));
        Assert.assertEquals(5, palindromeRunner.getMinPalindromeBase(12));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(13));
        Assert.assertEquals(6, palindromeRunner.getMinPalindromeBase(14));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(15));
        Assert.assertEquals(3,  palindromeRunner.getMinPalindromeBase(16));
        Assert.assertEquals(2, palindromeRunner.getMinPalindromeBase(17));
        Assert.assertEquals(5, palindromeRunner.getMinPalindromeBase(18));
        Assert.assertEquals(18, palindromeRunner.getMinPalindromeBase(19));
        Assert.assertEquals(3, palindromeRunner.getMinPalindromeBase(20));
    }
}
