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
    }
}

