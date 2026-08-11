class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int finalLength = 0;
        
        for(int right = 0; right < s.length(); right++){
           while(charSet.contains(s.charAt(right))){
            charSet.remove(s.charAt(left));
            left++;
           }
           charSet.add(s.charAt(right));
           finalLength = Math.max(finalLength, right - left + 1);
        }
        return finalLength;
    }
}
