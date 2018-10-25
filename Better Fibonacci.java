// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int betterFibonacci(int n) {
    int n_2 = 0;
    int n_1 = 1;
    int tmp;
    if(n == 0) return n_2;
    if(n == 1) return n_1;
    for(int i = 2; i <= n; i++){
        tmp = n_1 + n_2;
        n_2 = n_1;
        n_1 = tmp;
    }
    return n_1;
}
