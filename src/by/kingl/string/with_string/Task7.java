package com.common.string.with_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stroka = new StringBuilder(reader.readLine());
        for (int i = 0; i < stroka.length(); i++) {
            for (int j = i + 1; j < stroka.length(); j++) {
                if(stroka.charAt(j - 1) == ' '){ // Если знак ' ' то удаляем.
                    stroka.deleteCharAt(j - 1);

                } else {
                    if(stroka.charAt(i) == stroka.charAt(j)){ // Удаляем все повторения определенного символа.
                        stroka.deleteCharAt(j);
                        j--;
                    }
                }
            }
        }
        System.out.println(stroka.toString());
        reader.close();
    }
}
