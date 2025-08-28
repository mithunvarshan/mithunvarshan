class Solution {
    public int maxScore(int[] cardPoints, int k) {
      /*  int lsum=0,rsum=0,n=cardPoints.length;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
         int maxsum=lsum;
        int rindex=n-1;
        for(int j=k-1;j>=0;j--){
            lsum-=cardPoints[j];
            rsum+=cardPoints[rindex];
            rindex-=1;
            maxsum=Math.max(maxsum,rsum+lsum);
        }
  return maxsum;*/
    int lsum=0,n=cardPoints.length,rsum=0;
    for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
    }
    int maxsum=lsum,index=n-1;
    for(int i=k-1;i>=0;i--){
        lsum-=cardPoints[i];
        rsum+=cardPoints[index];
        index-=1;
        maxsum=Math.max(maxsum,rsum+lsum);
    }
    return maxsum;
    }
}