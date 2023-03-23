public class App {
    public static void main(String[] args) {
        // String[] babbling = {"aya", "yee", "maa", "u", "wyeoo"};
        String[] babbling = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
        String[] comp = { "aya", "ye", "woo", "ma" };
        boolean status = true;
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            do {
                for (String item : comp) {
                    if (babbling[i].startsWith(item)) {
                        babbling[i] = babbling[i].replace(item, "");
                        status = true;
                        break;
                    } else
                        status = false;
                }
                if (babbling[i].length() == 0) {
                    answer += 1;
                    status = false;
                }
            } while (status);
        } // for

        System.out.println(answer);
    } /* main */
} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */