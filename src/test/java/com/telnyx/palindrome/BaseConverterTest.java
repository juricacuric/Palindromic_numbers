package com.telnyx.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class BaseConverterTest {

    @Test(expected = IllegalArgumentException.class)
    public void tryToConvertToBase1_shouldThrowException() {
        final int maxBase = 2;
        final int randomNumberForConversion = 42;
        BaseConverter baseConverter = new BaseConverter(maxBase);
        baseConverter.convert(randomNumberForConversion, 1);
    }
    
    @Test
    public void testConverterAgainstJavaDefaultConverterForBase2() {
        final int base = 2;
        BaseConverter baseConverter = new BaseConverter(base);
        for (int i = 1; i <= 1000; i++) {
            String baseConverterResult = baseConverter.convert(i, base);
            String javaConverterResult = Integer.toBinaryString(i);
            Assert.assertEquals(javaConverterResult, baseConverterResult);
        }
    }

    @Test
    public void testConverterAgainstJavaDefaultConverterForBase8() {
        final int base = 8;
        BaseConverter baseConverter = new BaseConverter(base);
        for (int i = 1; i <= 1000; i++) {
            String baseConverterResult = baseConverter.convert(i, base);
            String javaConverterResult = Integer.toOctalString(i);
            Assert.assertEquals(javaConverterResult, baseConverterResult);
        }
    }

    @Test
    public void testConverterAgainstJavaDefaultConverterForBase16() {
        final int base = 16;
        BaseConverter baseConverter = new BaseConverter(base);
        for (int i = 1; i <= 1000; i++) {
            String baseConverterResult = baseConverter.convert(i, base);
            String javaConverterResult = Integer.toHexString(i);
            Assert.assertEquals(javaConverterResult, baseConverterResult);
        }
    }

    @Test
    public void testConverterAgainstJavaDefaultConverterForBase36() {
        final int base = 36;
        BaseConverter baseConverter = new BaseConverter(base);
        for (int i = 1; i <= 1000; i++) {
            String baseConverterResult = baseConverter.convert(i, base);
            String javaConverterResult = Integer.toString(i, base);
            Assert.assertEquals(javaConverterResult, baseConverterResult);
        }
    }
}
