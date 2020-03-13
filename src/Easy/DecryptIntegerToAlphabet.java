package Easy;

public class DecryptIntegerToAlphabet {

    public static void main(String args[]) {
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    public static String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((i+2) < s.length() && s.charAt(i+2) == '#') {
                sb.append((char) (96 + Integer.parseInt(s.substring(i, i+2))));
                i += 2;
            } else {
                sb.append((char) (96 + Integer.parseInt(s.substring(i, i+1))));
            }
        }

        return sb.toString();

    }

}
