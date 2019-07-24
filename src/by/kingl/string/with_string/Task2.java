package com.common.string.with_string;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Yuri Gagarin was the first man to go into space.");
        int index = 0;
        System.out.println("Старая строка");
        System.out.println("Yuri Gagarin was the first man to go into space.");
        while (str.indexOf("a", index) != -1){ // Идем по строке и ищем символ с опрделнного индекса, до тех пор пока символ найден
            index = str.indexOf("a", index) + 1; // Метод нахождения индекса символа
            str.insert(index, "b"); // Вставляем символ после определенного символа.
        }
        System.out.println("Новая строка");
        System.out.println(str);
    }
}
