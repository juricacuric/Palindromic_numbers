package com.telnyx.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class InputParserTest {

    @Test
    public void testParserWithoutInputParams_shouldReturnDefaultValues() {
        String[] args = new String[0];
        InputParser inputParser = new InputParser(args);
        Assert.assertEquals(InputParser.DEFAULT_SIZE, inputParser.getMaxNumber());
        Assert.assertEquals(InputParser.DEFAULT_RESULT_FILE, inputParser.getResultFile());
    }

    @Test
    public void testParserWithNullInputParams_shouldReturnDefaultValues() {
        InputParser inputParser = new InputParser(null);
        Assert.assertEquals(InputParser.DEFAULT_SIZE, inputParser.getMaxNumber());
        Assert.assertEquals(InputParser.DEFAULT_RESULT_FILE, inputParser.getResultFile());
    }

    @Test
    public void testParserWithMaxNumberInputParam_shouldReturnInputParam() {
        String[] args = {"10"};
        InputParser inputParser = new InputParser(args);
        Assert.assertEquals(10, inputParser.getMaxNumber());
        Assert.assertEquals(InputParser.DEFAULT_RESULT_FILE, inputParser.getResultFile());
    }

    @Test
    public void testParserWithInvalidMaxNumberInputParam_shouldReturnDefaultValues() {
        String[] args = {"abc"};
        InputParser inputParser = new InputParser(args);
        Assert.assertEquals(InputParser.DEFAULT_SIZE, inputParser.getMaxNumber());
        Assert.assertEquals(InputParser.DEFAULT_RESULT_FILE, inputParser.getResultFile());
    }

    @Test
    public void testParserWithAllValidInputParam_shouldReturnInputParams() {
        String[] args = {"10", "result.csv"};
        InputParser inputParser = new InputParser(args);
        Assert.assertEquals(10, inputParser.getMaxNumber());
        Assert.assertEquals("result.csv", inputParser.getResultFile());
    }
}
