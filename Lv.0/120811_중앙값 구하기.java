public class App {

    public static int[] src;
    public static int[] tmp;

    public static void main(String[] args) {
        // src = array;
        src = new int[] { 1, 9, 8, 5, 4, 2, 3, 7, 6 };
        tmp = new int[src.length];
        printArray(src);
        mergeSort(0, src.length - 1);
        printArray(src);
        // int index = src.length / 2;
        // return src[index];
    } /* main */

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                // 안정 정렬이기 때문에 index를 유지
                if (q > end || (p <= mid && src[p] <= src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }

            for (int i = start; i <= end; i++) {
                src[i] = tmp[i];
            }
        }
    } /* mergeSort */

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    } /* printArray */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */