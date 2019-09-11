package ColLesson03;

import java.util.Scanner;

public class ColLesson03 {

    public static void main(String[] args) {
        Word[] xxx = new Word[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        int n = 0;
        while (true) {
            String input = sc.nextLine();

            if (input.equals("e")) {
                break;
            }
            Word yyy = new Word(input);

            try {
                xxx[n] = yyy;
                n++;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
        }
        for (int i = 0; i < n; i++) {

        System.out.println(xxx[i]);

        }
        System.out.println(n + "件、登録しました。");
    }
}

