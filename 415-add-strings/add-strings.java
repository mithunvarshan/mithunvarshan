import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger nums=new BigInteger(num1);
        BigInteger nums1=new BigInteger(num2);
        BigInteger sum=nums.add(nums1);
        return sum.toString();
    }
}