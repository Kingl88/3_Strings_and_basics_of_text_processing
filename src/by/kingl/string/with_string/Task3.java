package com.common.string.with_string;

public class Task3 {
    public static void main (String[] args){
        String str1 = "шалаш"; // Слово для проверки
        String str2 = (new StringBuilder(str1).reverse()).toString(); // Создаем объект StringBuilder и копируем в него str1,
        if(str1.equalsIgnoreCase(str2)){    // делаем реверс строки str1, и приводим к типу String.
            System.out.println(" Слово палиндром"); // Далее сравниваем 2 строки и выводим соответсвующие сообщения.
        } else{
            System.out.println("Слово непалиндром");
        }
    }
}
