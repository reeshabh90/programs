/**
 * Fibonnaci
 */
public class Fibonnaci {

    public int fibonnaciSeq(int n) {
        if (n == 0) {
            return 0;
        } 
        else if(n == 1) {
            return 1;
        } else {
            return fibonnaciSeq(n-2) + fibonnaciSeq(n-1);
        }
    }

    public static void main(String[] args) {
        Fibonnaci fib = new Fibonnaci();
        for (int i = 0; i < 10; i++) {
            System.out.println(fib.fibonnaciSeq(i));
        }

    }
}