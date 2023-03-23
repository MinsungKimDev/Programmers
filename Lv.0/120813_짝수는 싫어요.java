public class App {

    public static void main(String[] args) {
        // int n = 10;
        int n = 15;
        int index = 0;
        int[] answer = new int[(n%2 == 0) ? n/2 : n/2+1];

        for (int x=1; x<=n; x++) {
            if (x%2 == 1) {
                answer[index] = x;
                index++;
            }
        }

        for(int item : answer) System.out.print(item);
        System.out.println();

    } /* main */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */