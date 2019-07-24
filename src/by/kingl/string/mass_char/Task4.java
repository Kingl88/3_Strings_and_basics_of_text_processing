package com.common.Strings.mass_char;

public class Task4 {
    public static void main(String[] args) {
        String stroka = "7889rg89d7g889yugyt854 7 g7 7y45yt754858t 747 0450 7tr807g 54 754 t4rt 78 hdsfhg8p9"; // Строка для проверки.
        char[] mass_char = stroka.toCharArray(); // Преобразуем строку в массив символов.
        int count = 0; // Счетчик подсчета чисел.
        for (int i = 0; i < mass_char.length; i++) {
            int num = 0; // Счетчик для подсчета цифр идущих вподряд в строке.
            while(i != mass_char.length && mass_char[i] >= '0' && mass_char[i] <= '9'){ // В цикле находимся пока вподряд идут цифры.
                num++;  // Условие "i != mass_char.length" что бы проверялся последний символ в массиве символов, ставим вперед.
                i++;
            }
            if(num > 0){ // Если счетчик не ноль значит были цифры или числа, значит увеличиваем счетчик подсчета чисел.
                count++;
            }
        }
        System.out.println("Количество чисел = " + count); // Вывод результата
    }
}
