package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner searchPhrase = new Scanner(System.in);
        System.out.println("Search words: ");
        String searchSeq = searchPhrase.nextLine();
        System.out.println(searchSeq);

        boolean isFound = passage.contains(searchSeq);

        System.out.println("Found " + searchSeq + "?: " + isFound);

    }
}
