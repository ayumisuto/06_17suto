package ColLesson02;

public class Word {
    String word;
    String meaning;

    public String toString(){

        String[] str = input.split(" ");
        //↑　いらない？
        this.word = str[0];
        this.meaning = str[1];
    return "単語:" + this.word + "意味:" + this.meaning;
}
}