// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String compressString(String text) {
    if (text == null) return null;
    
    if (text.isEmpty()) return "";
    
    int count = 0;
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        count++;
        
        if (i + 1 >= text.length() || text.charAt(i) != text.charAt(i + 1)) {
            builder.append(text.charAt(i));
            if (count > 1) builder.append(count);
            count = 0;
        }
    }
    return builder.toString();
}
