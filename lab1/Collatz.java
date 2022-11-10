/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */

public class Collatz {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n>1) {
            if (n % 2 == 1) {
                n = 3 * n + 1;
                System.out.print(n + " ");
            }
            n = n / 2;
            System.out.print(n + " ");
        }
    }
}