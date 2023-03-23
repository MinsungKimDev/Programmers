public class App {

    public static void main(String[] args) {
        int n = 15;
        int answer = 0;

        if (n>=1 && n<=7) {
            answer = 1;
        } else {
            if (n%7 == 0) answer = n/7; 
           else answer = n/7 + 1;
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