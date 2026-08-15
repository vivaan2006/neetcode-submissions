class Solution {
    private static final String DELIMITER = String.valueOf((char) 31);
    public String encode(List<String> strs) { 
        if(strs == null || strs.isEmpty()){ 
            return ""; 
        } 
        StringBuilder sb = new StringBuilder(""); 
        for(String str : strs){ 
            sb.append(DELIMITER).append(str); 
        } 
        return sb.toString(); 
    } 

    public List<String> decode(String str) {
        if(str == null || str.isEmpty()){
            return new ArrayList<>();
        }
        return Arrays.asList(str.substring(1).split(DELIMITER, -1));
    }
}
