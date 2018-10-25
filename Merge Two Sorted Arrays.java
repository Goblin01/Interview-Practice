// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    int rLen = arrRight.length;
    int lLen = arrLeft.length;
    int[] merge = new int[rLen + lLen];
    int rPos = 0;
    int lPos = 0;
    int pos = 0;
    while(rPos != rLen && lPos != lLen){
        if(arrLeft[lPos] < arrRight[rPos]){
            merge[pos++] = arrLeft[lPos++];
        }else{
            merge[pos++] = arrRight[rPos++];
        }
    }
    
    while(rPos != rLen && lPos == lLen){
        merge[pos++] = arrRight[rPos++];
    }
    
    while(lPos != lLen && rPos == rLen){
        merge[pos++] = arrLeft[lPos++];
    }
    
    return merge;
}
