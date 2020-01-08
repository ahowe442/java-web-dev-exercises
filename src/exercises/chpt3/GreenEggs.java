package exercises.chpt3;

public class GreenEggs {
    public static void main (String[] args) {
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] arrOfStr = greenEggs.split(" ");
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
