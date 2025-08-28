class Solution {
    public int lengthOfLongestSubstring(String s) {
      /*   int left=0,maxlen=0;
         HashSet<Character>set=new HashSet<>();
          int n=s.length();
          for(int right=0;right<n;right++){
            char c=s.charAt(right);
                    while(set.contains(c)){
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(c);
                    maxlen=Math.max(maxlen,right-left+1);
          }
          return maxlen;
    }*/
    int left=0,maxlen=0;
Set<Character>list=new HashSet<>();
int n=s.length();
for(int right=0;right<n;right++){
    char c=s.charAt(right);
    while(list.contains(c)){
        list.remove(s.charAt(left));
        left++;
    }
    list.add(c);
    maxlen=Math.max(maxlen,right-left+1);
}
return maxlen;
}
}