// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ArrayList<String> removeDuplicates(List<String> input) {
    TreeSet<String> ts = new TreeSet<String>();
    
    for (String word : input) {
        ts.add(word);
    }
    return new ArrayList(ts);
}
