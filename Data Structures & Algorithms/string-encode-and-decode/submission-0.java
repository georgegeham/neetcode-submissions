class Solution {
    private static final char DELIMITER = '#';
    public String encode(List<String> strs) {
                StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append(DELIMITER).append(str);
        }
        return encoded.toString();


    }

    public List<String> decode(String str) {
 List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiterIndex = str.indexOf(DELIMITER, i);               // 1. find '#'
            int length = Integer.parseInt(str.substring(i, delimiterIndex)); // 2. parse length
            int start = delimiterIndex + 1;
            int end = start + length;
            decoded.add(str.substring(start, end));                       // 3. read exactly 'length' chars
            i = end;                                                      // 4. jump to next number
        }
        return decoded;
    }
}
