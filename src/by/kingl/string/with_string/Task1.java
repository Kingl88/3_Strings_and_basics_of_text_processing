package com.common.string.with_string;

public class Task1 {
    public static void main(String[] args) {
        String str = "oifioweu uert    gdfhgd   gdfgdf      gddfgsd gsdgsdg  fdgsdfgsd          fdgsdgsdgsd  fgsdfgsd  gds";
        int temp = 0, count;
        for(int i = 0; i < str.toCharArray().length; i++){
            count = 0;
            while (str.toCharArray()[i] == ' '){
                count++;
                i++;
            }
            if(count > temp){
                temp = count;
            }
        }
        System.out.println("Максимальное число пробелов в тексте = " + temp);
    }
}
