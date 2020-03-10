package Easy;

import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {

    public static void main(String args[]) {
        System.out.println(uniqueOccurrences(new int[] {1, 2, 1, 4, 4, 4, 1}));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();//map that holds numbers and their occurences

        //iterate through arr
        for (int i = 0; i < arr.length; i++) {
            if (occ.containsKey(arr[i])) {//add to occurences
                occ.put(arr[i], occ.get(arr[i]) +1);
            } else {//add a new number to the map
                occ.put(arr[i], 1);
            }
        }

        HashMap<Integer, Integer> swap = new HashMap<Integer, Integer>();//reverses (key, value) in occ to (value, key) in swap
        for (Map.Entry<Integer, Integer> entry : occ.entrySet()) {
            swap.put(entry.getValue(), entry.getKey());
        }

        return swap.size() == occ.size();//if occ and swap are the same size the occurences are unique

    }

}
