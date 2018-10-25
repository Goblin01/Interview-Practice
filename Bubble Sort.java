// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    int tmp;
    // reverse loop
    for(int i = arr.length; i > 0; i--){
        // loop through array
        for(int j = 1; j < i; j++){
            // swap
            if(arr[j] < arr[j-1]){
                tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
    }
    
    return arr;
}
