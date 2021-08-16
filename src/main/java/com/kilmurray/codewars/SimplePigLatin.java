package com.kilmurray.codewars;

import java.util.regex.Pattern;

// Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched. 5 kyu.

public class SimplePigLatin {
    public static String pigIt(String str) {
        // Write code here
        String[] wordArray = str.split(" ");
        String tempWord;
        char first;
        for (int i = 0; i < wordArray.length; i++) {
            if (!Pattern.matches("\\p{Punct}",wordArray[i])){
                first = wordArray[i].charAt(0);
                tempWord = wordArray[i].substring(1);
                tempWord = tempWord + first + "ay";
                wordArray[i] = tempWord;
            }
        }
        return String.join(" ", wordArray);
    }
}
