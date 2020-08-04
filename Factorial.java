/**
 * Factorial
 */
public class Factorial {

    public int calculateFactorial(int n) {
        if(n < 1) {
            return 1;
        } 
        if(n == 1) {
            return n;
        }
        else {
            return n * calculateFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        System.out.println("Result: " + fac.calculateFactorial(5));
    }
}