class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> table = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);
            if(!table.containsKey(sortedString)){
                table.put(sortedString, new ArrayList<>());
            }
            table.get(sortedString).add(str);
        }
        return new ArrayList<>(table.values());
    }
}
