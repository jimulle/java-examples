// package com.jimulle.mda;
import static java.lang.System.out;

public class MultiDimArrays {
    public static void main(String[] args) {
        String[][] sayings = 
            new String[][] {
                { "hello",  "world",    "!" },
                { "I",      "am",       "JIM" },
                { "How",    "are",      "you?" }
            };
        
        out.println(sayings[1][2]);
        out.println(sayings[2][1]);
        out.println(sayings[0][0]);
    }
}
