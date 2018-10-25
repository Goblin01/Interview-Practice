// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String insertPairStar(String s) {
    if(s == null || s.length() < 2) return s;
    if(s.charAt(0) == s.charAt(1)) return s.charAt(0) + "*" + insertPairStar(s.substring(1, s.length()));
    return s.charAt(0) + insertPairStar(s.substring(1, s.length()));
}
