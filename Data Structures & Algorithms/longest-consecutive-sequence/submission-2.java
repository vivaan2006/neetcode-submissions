class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxSequence = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                maxSequence = Math.max(maxSequence, currentStreak);
            }
        }
        return maxSequence;
    }
}