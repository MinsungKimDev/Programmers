public class App {

    public static void main(String[] args) {
        /* test case */
        int slice = 7;
        int n = 10;
        /* test case */
        int i = 1;
        while(true) {
            // if(slice * i / n > 0) return i;
            if(slice * i / n > 0) break;
            else i++;
        }

        System.out.println(i);
    } /* main */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */