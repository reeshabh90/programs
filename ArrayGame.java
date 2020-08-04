
public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        int i = 0;
        while (i < game.length) {
            if ((i + leap) > game.length) {
                return true;
            }
            if (game[i + 1] != 0) {
                if (game[i + leap] != 0) {
                    return false;
                } else {
                    i = i + leap;
                }
            } else {
                i = i + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int leap = 14;
        int[] game = { 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 };

        System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }

}