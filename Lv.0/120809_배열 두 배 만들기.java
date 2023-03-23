public class App {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        int[] answers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answers[i] = numbers[i] * 2;
        }

        for (int item : answers) {
            System.out.println(item);
        }

    } /* main */
} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */