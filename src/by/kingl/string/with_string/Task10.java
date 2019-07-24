package com.common.string.with_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        String[] sentence = stroka.split("\\.|1|&");
        System.out.println(sentence.length);
    }
}
