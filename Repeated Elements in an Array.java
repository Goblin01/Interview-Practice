// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
    
    
    TreeSet<Integer> res = new TreeSet<Integer>();
    Arrays.sort(numbers);
    
    for(int i = 1; i < numbers.length; i++){
        if(numbers[i] == numbers[i-1]){
            res.add(numbers[i]);
        }
    }
    return res.toString();
    
}
