// https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {

        char c[] = command.toCharArray();
        String s = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'G') {
                s = s + 'G';
            } else if (c[i] == '(') {
                i++;
                if (c[i] == ')') {
                    s = s + 'o';
                } else if (c[i] == 'a') {
                    s = s + 'a';
                }

            } else if (c[i] == 'a') {
                s = s + 'a';
            } else if (c[i] == 'l') {
                s = s + 'l';
            }
        }
        return s;

    }
}