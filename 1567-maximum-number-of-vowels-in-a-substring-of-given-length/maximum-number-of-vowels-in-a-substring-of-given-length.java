class Solution {
    public int maxVowels(String s, int k) {
        int  left=0,maxlen=0,count=0,n=s.length();
        /* while(left+k<=n){
                String m=s.substring(left,left+k);
                for(int i=0;i<m.length();i++){
                    if(m.charAt(i)=='a'||m.charAt(i)=='e'||m.charAt(i)=='i'||m.charAt(i)=='o'||m.charAt(i)=='u'){
                        count++;
                    }
                     maxlen=Math.max(maxlen,count);
                }
                count=0;
                left++;   
         }
         return maxlen;*/
         for(int i=0;i<k;i++){
            if(vowel(s.charAt(i)))count++;
         }
         maxlen=count;
         for(int right=k;right<n;right++){
            if(vowel(s.charAt(right)))count++;
            if(vowel(s.charAt(right-k)))count--;
            maxlen=Math.max(maxlen,count);
         }
         return maxlen;
    }
         public boolean vowel(char c){
                    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
         }

    }
    
