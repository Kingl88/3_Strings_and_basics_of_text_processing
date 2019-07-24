package com.common.Strings.mass_char;

import java.util.Arrays;

public class Task5 {
    public static void main (String[] args){
        String str = "   kjdfjkdshf  ghhdhfd   fdghg  igdshgsdh hgdsgsdhghsdh   sfgsdhhsdf sdiisdfsdh sdio h h xdk hvg hdsd oi g   ssdudfi    ";
        char[] mass_char = str.toCharArray();
        int count = 0;
        for (int i = 0; i < mass_char.length; i++) { // Ищем пробелы вначале строки.
            if(mass_char[i] == ' '){
                count++;
            } else {
                break;
            }
        }
        char[] mass = new char[mass_char.length - count]; // Создаем новый массив и записываем в него старый без пробелов вначале.
        for (int i = 0, j = 0; i < mass_char.length - count; j++, i++) {
            mass[j] = mass_char[i + count];
        }

        count = 0;
        for (int i = mass.length - 1; i > 0; i--) { // Ищем пробелы в конце строки.
            if(mass[i] == ' '){
                count++;
            } else {
                break;
            }
        }
        char[] mass1 = new char[mass.length - count]; // Создаем новый массив и в него запишем старый без пробелов в конце.
        for (int i = mass.length - 1, j = mass.length - count - 1; j >= 0; j--, i--) {
            mass1[j] = mass[i - count];
        }
        count = 0;
        for(int i = 0, j = 0; i < mass1.length; j++, i++){ // В массиве убираем лишние пробелы.
            mass1[j] = mass1[i];
            if(mass1[i] == ' '){
                while (mass1[i + 1] == ' '){
                    count++;
                    i++;
                }
            }
        }
        char[] mass_End = new char[mass1.length - count]; // Создаем конечный массив в котором удаляем лишнии символы в конце.
        for (int i = mass1.length - 1, j = mass1.length - count - 1; j >= 0; j--, i--) {
            mass_End[j] = mass1[i - count];
        }
        System.out.println(Arrays.toString(mass_End));
    }
}
