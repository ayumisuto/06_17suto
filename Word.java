package com.company;

    public class Word {
       String word;
       String meaning;

       public Word (String input){
            String[]str = input.split(" ");
            this.word = str[0];
            this.meaning = str[1];
    }
}