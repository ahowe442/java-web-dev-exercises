package exercises.chpt3;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArr = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArr.length; i++) {
            //System.out.println(intArr[i]);
            if (intArr[i] % 2 != 0) {
                System.out.println(intArr[i]);
            } else {
                System.out.println("even number ");
            }
        }
        GreenEggs();
    }
    public static void GreenEggs(){
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] paragraph = greenEggs.split(" ");
        for (String word : paragraph)
            System.out.println(word);
    }


}

