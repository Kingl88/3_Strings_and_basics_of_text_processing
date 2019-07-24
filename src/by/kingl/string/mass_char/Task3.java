package com.common.Strings.mass_char;

public class Task3 {
    public static void main(String[] args) {
        String str = "8f78fsa67854v64v gy 6vb yg87ov 6g 76b v6743v t 98"; // Создаем строку для проверки.
        char[] mass_char = str.toCharArray(); // Преобразуем строку в массив символов.
        int count = 0; // Переменная для подсчета символов в строке.
        for (int i = 0; i < mass_char.length; i++) {
            if(mass_char[i] >= '0' && mass_char[i] <= '9'){
                count++;
            }
        }
        System.out.println("Количество цифр = " + count);
    }
}
