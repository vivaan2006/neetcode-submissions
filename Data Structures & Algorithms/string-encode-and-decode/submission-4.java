class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for(String str : strs){
            sb.append(str.length()).append(",").append(str);
        }
        return sb.toString();
    }

public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int commaIndex = str.indexOf(',', i);
        int length = Integer.parseInt(str.substring(i, commaIndex));
        
        int wordStart = commaIndex + 1;
        result.add(str.substring(wordStart, wordStart + length));
        
        i = wordStart + length;
    }
    return result;

    }
}   