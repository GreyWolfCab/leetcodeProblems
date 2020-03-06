package Easy;

import java.util.HashSet;
import java.util.Collections;

public class SmallestRangeI {

    public static void main(String args[]) {
        int[] A = {0, 10};
        int K = 3;
        System.out.println(smallestRangeI(A, K));
    }

    /**
     * given an array and a value, find the minimum difference between the max and min values in the array if you can
     * add or subtract any value between [0, K] to the max and min values.
     * @param A an int array with one or more values
     * @param K a value that gives you a range to work with
     * @return the minimum difference between the max and min values in A after being manipulated by K
     */
    public static int smallestRangeI(int[] A, int K) {
        int minDiff = 0;//the minimum difference
        int max = A[0];//max value in A
        int min = A[0];//min value in A
        for (int i = 1; i < A.length; i++) {//iterate through A
            max = Math.max(max, A[i]);//store the max value
            min = Math.min(min, A[i]);//store the min value
        }

        int diff = max - min;//find the difference between max and min

        if (diff - K <= K) {//if one subtraction of K from the difference is less than or equal to K our minDiff will be 0
            minDiff = 0;
        } else {//minDiff will be the difference, subtracted by the largest K value, twice
            minDiff = diff - 2*K;
        }

        return minDiff;
    }

}
