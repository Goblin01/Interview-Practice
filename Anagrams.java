// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isAnagram(String input1, String input2) {
    int[] buff = new int[256];
    if(input1 == null || input2 == null || input1.length() != input2.length()) return false;
    
    for(int i = 0; i < input1.length(); i++){
        buff[input1.charAt(i)]++;
        buff[input2.charAt(i)]--;
    }
    
    for(int k = 0; k < buff.length; k++){
        if(buff[k] != 0) return false;
    }
    return true;
}
