// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
    int len = matrix.length;
    for(int i = 0; i < len/2; i++){
        int[] tmp = matrix[i];
        matrix[i] = matrix[len-1-i];
        matrix[len-1-i] = tmp;
    }
}
