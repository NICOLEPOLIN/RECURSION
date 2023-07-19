public class Main {
    private static int ics(String s, String t) {
        // Base case: If either of the strings is empty, return 0
        if (s.length() == 0 || t.length() == 0)
            return 0;

        // If the last characters of both strings are equal
        if (s.charAt(s.length() - 1) == t.charAt(t.length() - 1))
            return 1 + ics(s.substring(0, s.length() - 1), t.substring(0, t.length() - 1));

        // If the last characters are different, find the maximum LCS
        int ics = ics(s, t.substring(0, t.length() - 1));
        int ics = ics(s.substring(0, s.length() - 1), t);
        return Math.max(ics1,ics2);
    }


}