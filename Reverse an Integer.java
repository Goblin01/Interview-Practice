// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int reverseInt(int x) {
    int rev = 0;
    
    while(x != 0){
        rev = rev*10 + x%10;
        x = x/10;
    }
    return rev;
}
