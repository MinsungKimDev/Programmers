public class App {

    public static void main(String[] args) {
        // String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int minY = -1;
        int minX = -1;
        int maxY = -1;
        int maxX = -1;
        
        // 2차원 배열 순환
        for (int y=0; y<wallpaper.length; y++) 
        {
            for (int x=0; x<wallpaper[y].length(); x++)
            {
                if (wallpaper[y].charAt(x) == '#') // #이 나왔을 때
                {
                    if (y<minY || minY==-1) minY = y; // minY가 초기값이거나 y가 minY보다 작으면 minY = y
                    if (x<minX || minX==-1) minX = x; // minX가 초기값이거나 x가 minX보다 작으면 minX = x
                    if (y>maxY-1) maxY = y+1; // y > maxY-1 이면 maxY = y+1
                    if (x>maxX-1) maxX = x+1; // x > maxX-1 이면 maxX = x+1
                }
            }
        }
        
        int[] answer = {minY, minX, maxY, maxX};
        // return answer;

        for (int item : answer) {
            System.out.print(item);
        }
        System.out.println();

    } /* main */

} /* App */

/*
 * 자꾸 틀린 이유
 * 
 * 
 */