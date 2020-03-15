package Easy;

import Easy.linkedlist.SingleLinkedList;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class WeakestRows {

    public static void main(String args[]) {
        int[][] mat = {{1,0,0,0,0},
                {1,1,1,1,1},
                {1,1,0,0,0},
                {1,1,0,0,0},
                {1,0,0,0,0}};
        int k = 3;

        int[] temp = kWeakestRows(mat, k);

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ", ");
        }

    }

    public static int[] kWeakestRows(int[][] mat, int k) {

        int[] weakRows = new int[k];//the weakest k rows in mat
        int[] rowInfo = new int[mat.length];//the strength of each row in mat

        //iterate through matrix mat
        for (int i = 0; i < mat.length; i++) {//row

            int sold = 0;//soldier counter
            for (int q = 0; q < mat[0].length; q++) {//col
                if (mat[i][q] == 1) {//count soldiers
                    sold++;
                } else {//soldiers are always at the front
                    break;
                }
            }

            rowInfo[i] = sold;//set the soldier count for row i

        }

        HashSet<Integer> rowTracker = new HashSet<Integer>();//remember used rows
        for (int i = 0; i < k; i++) {//gather the k weakest rows

            int minInd = -1;//impossible row
            int minVal = Integer.MAX_VALUE;//very large value
            for (int q = 0; q < rowInfo.length; q++) {//iterate through every row
                //check if row hasn't been used and this is a new minimum value
                if (!rowTracker.contains(q) && rowInfo[q] < minVal) {
                    minInd = q;//remember row
                    minVal = rowInfo[minInd];//remember strength of row
                }
            }

            rowTracker.add(minInd);//prevent this row from being used again
            weakRows[i] = minInd;//add the row to the weak array

        }

        return weakRows;

    }

}
