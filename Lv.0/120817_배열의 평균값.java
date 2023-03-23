public class App {

    public static void main(String[] args) {
        /* test case */
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        /* test case */
        
        double sum = 0;

        for (int item : numbers) sum += item;

        sum /= numbers.length;

        System.out.println(sum);


    } /* main */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */