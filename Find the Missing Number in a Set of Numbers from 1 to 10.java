// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    
    int total = 55;
    
    for(int i = 0; i < arr.length; i++){
        total -= arr[i];
    }
    return total;
}
