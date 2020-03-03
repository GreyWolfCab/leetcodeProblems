package Easy.linkedlist;

public class ReverseInteger {

    public static void main(String args[]) {
        System.out.println(reverse(1534236469));//1534236469 expected: 0
    }

    /**
     * reverses the digits in the given value and returns the reversed value as an int
     * @param x the value to reverse
     * @return the reversed value
     */
    public static int reverse(int x) {

        int rev = 0;//stores the reversed value
        boolean isNeg = (x < 0) ? true : false;//is the value negative
        int temp = Math.abs(x);//absoluting eases operations on temp
        while (temp > 0) {//while the value is greater than 0
            try {//the Math.*Exact() may throw exceptions in case of overflow
                rev = Math.multiplyExact(rev, 10);//allow an extra digit
                rev = Math.addExact(rev, (temp%10));//set the new digit
                temp /= 10;//shift the value
            } catch(ArithmeticException ae) {//in case of overflow the value defaults to 0
                rev = 0;
                break;//exit the loop
            }
        }
        if (isNeg)//if the value should be negative
            rev *= -1;//negate the value
        return rev;
    }
}
