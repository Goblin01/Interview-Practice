// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean isIntPalindrome(int x) {            
    int num = x;
    //reversing number
    int reverse=0,remainder; 
    while(num > 0) 
    { 
        remainder = num % 10; 
        reverse = reverse * 10 + remainder; 
        num = num / 10; 
    } 
    return (reverse == x);
    
}
