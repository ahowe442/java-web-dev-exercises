package exercises.loops;

public class ForEachLoopStringExample {
    public static void main(String[] args){
        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
    }
}
