package com.common.string.with_string;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("Yuri Gagarin was the first man to go into space."); // Начальная строка
        StringBuilder stroka = new StringBuilder(str);
        for (int i = 0; i < str.length()*2; i++) {
            stroka.insert(i + 1, stroka.charAt(i));
            i++;
        }
        System.out.println(stroka.toString());
    }
}
