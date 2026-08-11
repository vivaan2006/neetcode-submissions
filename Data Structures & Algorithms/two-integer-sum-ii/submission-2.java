class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // return indices that add up to target
        // caveat: index 2 > index 1
        // condition: index 1 != index 2 ever. cant use same element twice

        // [1,1,2,2] target. = 4
        // for thsi case you increemnt left, leave right
        // increement left when indices sum is less than target
        // decrement right when indices sum is greater than target
        // if its equal to target return the indices
        int leftIdx = 0;
        int rightIdx = numbers.length - 1;

        while(leftIdx < rightIdx){
            int sum = numbers[leftIdx] + numbers[rightIdx];
            if(sum == target){
                return new int[]{leftIdx + 1, rightIdx + 1};
            }
            else if(sum < target){
                leftIdx++;
            }
            else if (sum > target){
                rightIdx--;
            }
        }
        return new int[]{};
    }
}
