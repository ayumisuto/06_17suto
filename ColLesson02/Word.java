package ColLesson02;

public class Word {
    String word;
    String meaning;

    public String toString() {
    return "単語:" + this.word + "意味:" + this.meaning;
    }

    public Word(String input){
        String[] str = input.split(" ");
        this.word = str[0];
        this.meaning = str[1];
    }
}
