package utils;

public class other {

    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }



    static int zaehleSelbstlaute(String s) {
        if (s.isEmpty()) return 0;
        int count = 0;

        count += ("aeiouAEIOU".contains(String.valueOf(s.charAt(0)))) ? 1 : 0;
        count += zaehleSelbstlaute(s.substring(1));

        return count;
    }



}
