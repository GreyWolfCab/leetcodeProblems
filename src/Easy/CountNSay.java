package Easy;

public class CountNSay {

    public static void main(String args[]) {
        System.out.println(countAndSay(10));
    }

    /**
     * recursive algorithm for counting the groups of repeating numbers "11122" = "3122"
     * @param n how deep of a sequence to return, larger n = larger sequence
     * @return the sequence of counted numbers
     */
    public static String countAndSay(int n) {

        if (n == 1) {//base case
            return "1";
        } else if (n == 2) {//base case
            return "11";
        } else {//recursive step
            String prev = countAndSay(n-1);//gather the previous sequence
            String seq = "";//the new sequence
            int i = 1;//index in previous
            char track = prev.charAt(0);//repeat letter tracker
            int cnt = 1;//total of repeated letters
            while(i < prev.length()) {//iterate through the previous sequence
                if (track != prev.charAt(i)) {//if the tracked letter has changed
                    seq += Integer.toString(cnt) + track;//update the new sequence
                    track = prev.charAt(i);//track the latest char
                    cnt = 1;//update tracker count
                } else {//else just another tracked char
                    cnt++;
                }
                i++;//increment through the previous sequence
            }
            seq += Integer.toString(cnt) + track;//update new sequence with the last values
            return seq;
        }

    }

}
