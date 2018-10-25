// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static double pow(double x, int n) {
    if(n == 0) return 1;
    if(n < 0) return pow(x, n+1) / x;
    return pow(x, n-1) * x;
}
