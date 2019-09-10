package com.company;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Word[] xxx = new Word[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");

        int n = 0;
        while (true) {
            String input = sc.nextLine();

            if (input.equals("e")){
                break;
            }
            Word yyy = new Word(input);
            xxx[n] = yyy;
            n++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        }
        // n = count
        for (int i = 0; i < n; i++) {

            System.out.println("単語:" + xxx[i].word + "意味:" + xxx[i].meaning);
        }
        System.out.println( n + "件、登録しました。");
    }
}
