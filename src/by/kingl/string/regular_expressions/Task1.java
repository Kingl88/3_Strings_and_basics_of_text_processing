package com.common.string.regular_expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void SortParagraph(String str) {
        String[] massStr = str.split("\\t");
        for (int i = 0; i < massStr.length; i++) {
            for (int j = 0; j < massStr.length - 1; j++) {
                if (massStr[j].split("([.!?]+)").length > massStr[j + 1].split("([.!?]+)").length) {
                    String temp = massStr[j];
                    massStr[j] = massStr[j + 1];
                    massStr[j + 1] = temp;
                }
            }
        }
        Print(massStr);
        System.out.println();
    }

    public static void Print(String[] str) {
        int count = 1;
        for (String str1 : str) {
            if (!str1.equals("")) {
                if (count == str.length) {
                    System.out.print(str1);
                    System.out.println();
                } else {
                    System.out.print(str1 + " ");
                }
            }
            count++;
        }
    }

    public static void SortSentence(String str) {
        String[] massStr = str.split("([.!?]+)");
        for (int i = 0; i < massStr.length; i++) {
            String[] mass = massStr[i].split("\\W");
            for (int k = 0; k < mass.length; k++) {
                for (int j = 0; j < mass.length - 1; j++) {
                    if (mass[j].length() > mass[j + 1].length()) {
                        String temp = mass[j];
                        mass[j] = mass[j + 1];
                        mass[j + 1] = temp;
                    }
                }
            }
            Print(mass);
        }
    }

    public static int CountLiteral(String str, char lit) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lit) {
                count++;
            }
        }
        return count;
    }

    public static void SortLiteral(String str, char lit) {
        if (str.indexOf(lit) != -1) {
            String[] massStr = str.split("([.!?]+)");
            for (int i = 0; i < massStr.length; i++) {
                String[] mass = massStr[i].split("\\W");
                for (int k = 0; k < mass.length; k++) {
                    if (mass[k].indexOf(lit) == -1) {
                        mass[k] = mass[k].replaceAll(".", "");
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], lit) > CountLiteral(mass[j + 1], lit)) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                for (int k = 0; k < mass.length; k++) {
                    for (int j = 0; j < mass.length - 1; j++) {
                        if (CountLiteral(mass[j], lit) == CountLiteral(mass[j + 1], lit) && mass[j].compareTo(mass[j + 1]) > 0) {
                            String temp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = temp;
                        }
                    }
                }
                Print(mass);
            }
        } else {
            System.out.println("Данного символа нету в тексте");
        }
    }

    public static void main(String[] args) throws IOException {
        String stroka = "\tThere are different kinds of animals on our planet, and all of them are very important for it. \nFor example, everybody knows that the sharks are dangerous for people, but they are useful for cleaning seawater. \nThere are two types of animals: domestic (or pets) and wild. People keep pets in their homes. And some wild animals are very dangerous. \nDomestic animals live next to people, whereas wild animals’ “homes” are forests, jungles, oceans and so on.\n" +
                "\tGiraffes are very beautiful and unusual animals. They are the tallest land animals in the world. \nGiraffes can reach a height of 5,5 m and a weight of 900 kg. They are famous for their long necks. But does anybody know, that giraffes have a very long tongue? \nThey even can clean the ears with it! Giraffes are usually yellow or light brown with dark stains. Giraffes live in African savannas. \nThey can live from 20 to 30 years. It is interesting to know, that giraffes sleep only twenty minutes at a time. They sit down on the ground and bend their long neck down.\n" +
                "\tGiraffes do not hunt. They eat leaves, grass, and fruit. \nDue to their long neck, they can reach the highest leaves on the trees that other animals cannot eat.\n" +
                "\tYou can often meet giraffes in city Zoos. \nThey are very friendly and all the children like them very much.";
        boolean flag = true;
        while (flag) {
            System.out.print("Что вы желаете сделать с текстом" + "\n1). Отсортировать абзацы по количеству предложений;" +
                    "\n2). В каждом предложении отсортировать слова по длине;" + "\n3). Отсортировать лексемы в предложении по убыванию количества " +
                    "вхождений заданного символа, а в случае равенства - по алфавиту." +
                    "\n4). Выход из программы.\n");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Сделайте выбор:");

            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    SortParagraph(stroka);
                    break;
                case 2:
                    SortSentence(stroka);
                    break;
                case 3:
                    System.out.println("Введите символ");
                    char literal = (char) reader.read();
                    SortLiteral(stroka, literal);
                    break;
                case 4:
                    System.out.println("Завершение программы.");
                    flag = false;
                    reader.close();
                    break;
            }
        }
    }
}
