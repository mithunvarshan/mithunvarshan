class Solution {
    public boolean isPerfectSquare(int num) {
        long nums=(long)Math.sqrt(num);
        return nums*nums==num;
    }
}