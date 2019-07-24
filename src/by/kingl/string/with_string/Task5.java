package com.common.string.with_string;

public class Task5 {
    public static void main (String[] args){
        String str = "Yuri Gagarin was the first man to go into space.";
        int index = 0;
        int count = 0;
        while (str.indexOf('a', index) != -1){
            index = str.indexOf("a", index) + 1;
            count++;
        }
        System.out.println("Количество буквы 'a' в строке = " + count + " шт.");
    }
}
