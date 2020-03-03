package Easy;

public class Fibonacci {

    public static void main(String args[]) {
        System.out.println(fibonacciSeq(4));
    }

    public static int fibonacciSeq(int x) {

        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fibonacciSeq(x-2) + fibonacciSeq(x-1);
        }

    }

}
