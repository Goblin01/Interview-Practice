// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isStringPalindrome(String str){
    
    if(str == null || str.length() < 2) return true;
    int len = str.length();
    for(int i = 0; i < len/2; i++){
        if(str.charAt(i) != str.charAt(len-1-i) ) return false;
    }
    return true;
}
