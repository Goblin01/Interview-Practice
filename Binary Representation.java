// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String computeBinary(int val) {
    if(val < 2) return Integer.toString(val);
    return computeBinary(val/2) + computeBinary(val%2);
}
