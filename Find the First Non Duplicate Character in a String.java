// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Character firstNonRepeatedCharacter(String str) {

    if(str == null || str == " " ) return null;
    HashMap<Character, Integer> hm = new HashMap<>();
    
    char cur;
    int count;
    for(int i = 0; i < str.length(); i++){
        cur = str.charAt(i);
        if( !hm.containsKey(cur)){
            hm.put(cur,1);
            continue;
        }else{
            count = hm.get(cur);
            hm.put(cur, ++count);
        }
    }
    
    for(int j = 0; j < str.length(); j++){
        cur = str.charAt(j);
        if(hm.get(cur) == 1){
            return cur;
        }
    }
    
    return null;

    
}
