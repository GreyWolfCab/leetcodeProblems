package Easy;

import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrentNumber {

    public static void main(String args[]) {
        int[] temp = {8,1,2,2,3};
        int[] gar = smallerNumbersThanCurrent(temp);

        for (int i = 0; i < gar.length; i++) {
            System.out.print(gar[i] + ", ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        HashMap<Integer, Integer> given = new HashMap<Integer, Integer>();//gimmicky here, dont use any hashing
        int[] smlrTracker = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (given.containsKey(nums[i])) {
                int val = given.get(nums[i]);
                given.put(nums[i], ++val);
            } else {
                given.put(nums[i], 1);
            }
        }

        for (int i = 0; i < smlrTracker.length; i++) {
            int cnt = 0;
            for (Map.Entry<Integer, Integer> entry : given.entrySet()) {

                if (entry.getKey() < nums[i]) {
                    cnt += entry.getValue();
                }

            }
            smlrTracker[i] = cnt;
        }

        return smlrTracker;

    }

}
