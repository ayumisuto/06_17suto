package ColLesson04;

import ColLesson02.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {

        ArrayList<Word> xxx = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");

        int n = 0;

        while (true) {

            String input = sc.nextLine();

            if (input.equals("e")) {
                break;
            }

            Word yyy = new Word(input);


            xxx.add(yyy);

            n++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        }

        for (int i = 0; i < n; i++) {

            System.out.println(xxx.get(i));
        }
        System.out.println( n + "件、登録しました。");
    }
}
