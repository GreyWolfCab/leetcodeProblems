package Easy;

import java.util.HashMap;

public class TwoSums {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    public static void main(String args[]) {
        int[] nums = {4, 7, 4, 15};
        int target = 8;
        HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();//create hashmap
        int[] indices = {-1, -1};

        for (int i = 0; i < nums.length; i++) {//store all values in the array as the key, store the values frequency as the value
            Integer c = hmap.get(nums[i]);//get the frequency of the value
            if (hmap.get(nums[i]) == null) {//if its a new value insert it to the hashmap
                hmap.put(nums[i], 1);
            } else {//otherwise add to the frequency
                hmap.put(nums[i], ++c);
            }
        }

        int val1 = -1;
        int val2 = -1;
        int diff;
        for (int i = 0; i < nums.length; i++) {//iterate through the array O(n)
            val1 = nums[i];//pick a starting value
            diff = target - nums[i];//calculate the desired value
            if (hmap.containsKey(diff) && (diff != val1 || hmap.get(diff) > 1)) {//search for the desired value and
                // make sure we are not looking at the starting value
                val2 = diff;
                break;
            }
        }

        System.out.println("val1: " + val1 + " val2: " + val2);
        for (int i = 0; i < nums.length; i++) {//iterate through the array to find the indices of the needed values
            if (indices[0] == -1 && nums[i] == val1)//we haven't set the first value and we have a match
                indices[0] = i;
            if (indices[0] != i && nums[i] == val2)//we aren't looking at a taken index and we have a match
                indices[1] = i;
        }

        System.out.println("index1: " + indices[0] + " index2: " + indices[1]);//these are the indices
    }

}
