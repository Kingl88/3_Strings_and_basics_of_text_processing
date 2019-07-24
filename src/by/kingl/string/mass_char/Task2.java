package com.common.Strings.mass_char;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String stroka = "word hellow word fldsklfwordfdsf wordl/k;l fsdfsword eqeqwofwefewrd"; // Строка для проверки.
        char[] stroka_ch = stroka.toCharArray(); // Функция разбиения строки на символы.
        int count = 0; // Счетчик слов которые нужно заменить.
        for (int i = 0; i < stroka_ch.length; i++) { // проход по массиву символов с подсчетом количества замен которые необходимо будет сделать.
            if(stroka_ch[i] == 'w' && stroka_ch[i + 1] == 'o' && stroka_ch[i + 2] == 'r' && stroka_ch[i + 3] == 'd'){
                count++;
                i+=4;
            }
        }
        char[] stroka_new = new char[stroka_ch.length + count]; // Новый массив символов куда будем записывать результат.
        for (int i = 0, j = 0; j < stroka_new.length; j++, i++) { // Проход по новому массиву с заменой необходимых символов.
            if(stroka_ch[i] == 'w' && stroka_ch[i + 1] == 'o' && stroka_ch[i + 2] == 'r' && stroka_ch[i + 3] == 'd'){
                stroka_new[j] = 'l';
                stroka_new[j + 1] = 'e';
                stroka_new[j + 2] = 't';
                stroka_new[j + 3] = 't';
                stroka_new[j + 4] = 'e';
                j+=4;
                i+=3;
            } else{
                stroka_new[j] = stroka_ch[i];
            }
        }
        System.out.println(Arrays.toString(stroka_new)); // Вывод результата.
    }
}
