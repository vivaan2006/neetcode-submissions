class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> table = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            char[] charArr = str.toCharArray();
            for(char ch : charArr){
                count[ch - 'a']++;
            }
            String key = Arrays.toString(count);
            table.putIfAbsent(key, new ArrayList<>());
            table.get(key).add(str);
        }
        return new ArrayList<>(table.values());
    }
}

/**
other loop logic:             
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);

**/
