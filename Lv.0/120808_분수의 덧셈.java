public class App {
    public static void main(String[] args) {
        /* test case */
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        /* test case */

        int numer = 0;
        int denom = 0;
        int share = 0;
        int max = 0;
        int[] answer = new int[2];

        if (denom1 == denom2) {
            numer = numer1 + numer2;
            denom = denom1; // 틀린 이유 2번
        } else {
            if (denom1 % denom2 == 0) {
                share = denom1 / denom2;
                numer2 *= share;

                numer = numer1 + numer2;
                denom = denom1;
            } else if (denom2 % denom1 == 0) {
                share = denom2 / denom1;
                numer1 *= share;

                denom1 *= share;

                numer = numer1 + numer2;
                denom = denom1;
            } else {
                numer1 *= denom2;
                numer2 *= denom1;

                denom1 *= denom2;

                numer = numer1 + numer2;
                denom = denom1;
            }
        }

        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0)
                max = i;
        }

        if (max != 0) {
            numer /= max;
            denom /= max;
        }

        answer[0] = numer;
        answer[1] = denom;

        for (int i : answer) {
            System.out.println(i);
        }

        // return answer;

    } /* main */
} /* App */

/*
 * 자꾸 틀린 이유
 * 1. 분수 덧셈 후 약분 안함
 * 2. 분모끼리 같을 때 denom 변수에 값을 안넣어줘서 초기화값 0이 들어감
 */