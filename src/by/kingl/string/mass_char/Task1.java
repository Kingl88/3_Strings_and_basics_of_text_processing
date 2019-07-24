package com.common.Strings.mass_string;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        char[] stroka = new char[]{'c', 'a', 'm', 'e', 'l', 'C', 'a', 's', 'e'};
        int count = 0;
        for (int i = 0; i < stroka.length - 1; i++) { // Поиск количества заглавных букв.
            if(stroka[i + 1] >= 'A' && stroka[i + 1] <= 'Z')
                count++;
        }
        char[] newstroka = new char[stroka.length + count];
        for (int i = 0, j = 0; j < newstroka.length; j++, i++) {
            if(stroka[i] >= 'A' && stroka[i] <= 'Z'){
                newstroka[j] = '_';
                newstroka[j + 1] = Character.toLowerCase(stroka[i]);
                j++;
            } else{
                newstroka[j] = stroka[i];
            }
        }
        System.out.println(Arrays.toString(newstroka));
    }
}
