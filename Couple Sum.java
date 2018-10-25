// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] coupleSum(int[] numbers, int target) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i = 0; i < numbers.length; i++){
        if(hm.containsKey(numbers[i])){
            return new int[] {hm.get(numbers[i]), i+1};
        }
        hm.put(target - numbers[i], i+1);
    }
    return null;
}
