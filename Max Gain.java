// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int maxGain(int[] a) {
    
    int min = Integer.MAX_VALUE;
    int maxGain = 0;
    for(int i = 0; i < a.length; i++){
        min = Math.min(min, a[i]);
        maxGain = Math.max(a[i]-min, maxGain);
    }
    return maxGain;
}
