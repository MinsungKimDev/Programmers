public class App {

    public static void main(String[] args) {

        /* test case */
        int[] array = {1,2,3,3,3,4};
        // int[] array = {1,1,2,2};
        // int[] array = {1};
        /* test case */
        int answer = 0;
        int max = 0;
        int cnt = 0;
        int freq[] = new int[1001]; // array의 원소는 0부터 1000까지 이므로 크기가 1001인 배열이 필요 
        
        // if(array.length == 1) return array[0];
        if(array.length == 1) answer = array[0];
        // 배열 길이가 1일때 예외 처리
        else {
            // 0부터 1000까지의 수의 빈도를 freq 배열에 할당
            for (int i=0; i<array.length; i++) {
                freq[array[i]]++;
                if (max < freq[array[i]]) max = freq[array[i]];
            }
    
            // 최빈값 갯수 찾기
            for (int i=0; i<freq.length; i++) {
                if (freq[i] == max) {
                    cnt++;
                    answer = i;
                }
            }
    
            // 최빈값 갯수 확인
            if(cnt > 1) {
                answer = -1;
            }
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