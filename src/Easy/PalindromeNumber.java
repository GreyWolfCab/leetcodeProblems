package Easy;

public class PalindromeNumber {

    public static void main(String args[]) {
        int x = 10101;

//        if (x < 0) {//return false for a negative value
//            return false;
//        }

        boolean isPalin = true;
        int xLen = 2;//used to initialize the matrix size
        int temp = x;
        while (temp > 9) {//count the number of digits in x
            temp = temp / 10;
            xLen++;//x's length
        }
        int[][] matrix = new int[xLen][xLen];//the matrix should have an extra row and col

        temp = x;//get a new instance of x
        for (int i = xLen; i > 0; i--) {//set the first row and column to be the digits of x, ignoring [0, 0], starts at the end
            matrix[i-1][0] = temp % 10;//set the 0 column
            matrix[0][i-1] = temp % 10;//set the 0 row
            temp = temp / 10;//truncate the LSB in x
        }

        int c = 1;//col index
        for (int r = xLen-1; r > 0; r--) {//iterate through the matrix comparing only the opposing digits
            if (matrix[r][0] == matrix[0][c]) {//if opposite digits match
                matrix[r][c] = 1;//1 indicates a match
            } else {//x is not a palindrome
                isPalin = false;
                break;
            }
            c++;//increment up and right
        }

        //print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("Is " + x + " a palindrome? " + isPalin);
    }

}
