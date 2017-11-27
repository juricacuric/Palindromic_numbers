package com.telnyx.palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseConverter {

    private final int maxBase;
    private final List<Character> characters;

    public BaseConverter(int maxBase) {
        this.maxBase = maxBase;
        this.characters = initCharacters();
    }

    private List<Character> initCharacters() {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            chars.add(Character.forDigit(i, 10));
        }
        for (int i = 'a'; i <= 'z'; i++) {
            chars.add((char) i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            chars.add((char) i);
        }
        for (int i = 'Z' + 1; chars.size() <= maxBase; i++) {
            chars.add((char) i);
        }
        return Collections.unmodifiableList(chars);
    }

    public String convert(int i, int radix) {
        if (radix < Character.MIN_RADIX || radix > characters.size())
            throw new IllegalArgumentException("Invalid base! Base has to be between " + Character.MIN_RADIX + " and " + characters.size());

        if (radix == 10){
            return String.valueOf(i);
        }

        StringBuilder builder = new StringBuilder();
        while (i >= radix) {
            builder.append(characters.get(i % radix));
            i = i / radix;
        }
        if (i != 0) {
            builder.append(characters.get(i));
        }
        return builder.reverse().toString();
    }
}
