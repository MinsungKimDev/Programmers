public class App {

    public static void main(String[] args) {
        int n = 17;
        int answer = 0;

        if (n>=1 && n<=3) {
            answer = 1;
        } else {
            if (n%6 == 0) {
                answer = n/6;
            } else if (n%3 == 0) {
                answer = n*2 / 6;
            } else if (n%2 == 0) {
                answer = n*3 / 6;
            } else answer = n;
        }

        System.out.println(answer);
        // return answer;
    } /* main */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */