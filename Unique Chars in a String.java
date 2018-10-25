// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
    boolean[] arr = new boolean[256];
    
    if(str == null){
        return true;
    }
    for(int i = 0; i < str.length(); i++){
        int pos = str.charAt(i);
        if(arr[pos] == false){
            arr[pos] = true;
            continue;
        }else{
            return false;
        }
    }
    return true;


}
