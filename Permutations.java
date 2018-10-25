// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean permutation(String str1, String str2) {
    int[] charCount = new int[127];
    if(str1.length() != str2.length()) return false;
    for(int i = 0; i < str1.length(); i++){
        charCount[str1.charAt(i)]++;
        charCount[str2.charAt(i)]--;
    }
    
    for(int j = 0; j < charCount.length; j++){
        if(charCount[j] != 0) return false;
    }
    return true;
}
