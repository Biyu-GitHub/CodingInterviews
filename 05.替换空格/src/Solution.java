public class Solution {
    public String replaceSpace(StringBuffer str) {
        int n = str.length();
        int spaceNum = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ')
                spaceNum++;
        }

        int newN = n + spaceNum * 2;

        str.setLength(newN);

        int i = n - 1;
        int j = newN - 1;

        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            } else
                str.setCharAt(j--, str.charAt(i));
            i--;
        }
        return str.toString();
    }
}