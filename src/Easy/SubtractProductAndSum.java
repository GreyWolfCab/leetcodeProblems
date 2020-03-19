package Easy;

public class SubtractProductAndSum {

    public static void main(String args[]) {
        System.out.println(subtractProductAndSum(705));
    }

    /**
     * Calculate the product of every digit, the sum of every digit, then subtract the sum from the product
     * @param n
     * @return
     */
    public static int subtractProductAndSum(int n) {

        int digitProduct = 1;//product of every digit
        int digitSum = 0;//sum of every digit

        while (n > 0) {//gather the LSB of n each iteration until n becomes 0

            digitProduct *= n%10;//grab the LSB for the product
            digitSum += n%10;//grab the LSB for the sum

            n = n / 10;//remove the LSB from n

        }

        return digitProduct - digitSum;//return the difference

    }

}
