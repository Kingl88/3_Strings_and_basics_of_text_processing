package com.common.string.with_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        String[] str = stroka.split(" ");
        String res = "";
        for (int i = 0; i < str.length; i++) {
            if(res.length()< str[i].length()){
                res = str[i];
            }
        }
        System.out.println(res);
    }
}
