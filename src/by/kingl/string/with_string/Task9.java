package com.common.string.with_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < stroka.length(); i++) {
            if(stroka.charAt(i) > 'a' && stroka.charAt(i) < 'z'){
                lower++;
            }
            if(stroka.charAt(i) > 'A' && stroka.charAt(i) < 'Z'){
                upper++;
            }
        }
        System.out.println("Верхний регистр = " + upper + "\nНижний регистр = " + lower);
    }
}
