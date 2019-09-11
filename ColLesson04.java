package ColLesson04;

import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {
        //ワード型配列を要素数10で生成する。
        //この状態ではワードのインスタンスが10個(0番目～9番目)入るただの箱が用意されただけで中身はnull
        //Word[] xxx = new Word[10];
        ArrayList<Word> xxx = new ArrayList<>();

        //スキャナが使えるようにする。
        Scanner sc = new Scanner(System.in);

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");

        int n = 0;

        while (true) {

            String input = sc.nextLine();

            if (input.equals("e")) {
                break;
            }

            Word yyy = new Word(input);

            xxx[n] = yyy;
            xxx[n].add();
            //xxx[n].add() = yyy; ??

            //スライド③p54 words[index] = wd → words.add(wd)
            //ここではwords=xxxとおいていると思うのですが、wd、indexなど対応している箇所がよくわかりません

            n++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        }

        for (int i = 0; i < n; i++) {

            System.out.println(xxx[i].get(i));
            xxx[i].side();

        }
        System.out.println(n + "件、登録しました。");
    }
}