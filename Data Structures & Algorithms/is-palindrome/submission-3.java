class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start  = 0;
        int end = s.length() - 1;
        while(end >= start){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end --;
            } else{
                return false;
            }
        }
        return true;
    }
}
