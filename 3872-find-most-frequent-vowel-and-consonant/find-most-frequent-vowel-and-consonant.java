class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int max1=0,max2=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (map.containsKey(ch)) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                } else {
                    map.put(ch, 1);
                }
            } else {
                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                }else{
                     map2.put(ch,1);
                }
                }
            }
            List<Integer>list1=new ArrayList<>(map.values());
            List<Integer>list2=new ArrayList<>(map2.values());
            if(!map.isEmpty()){
                 max1=Collections.max(list1);
            }else{
              max1=0;
            }
            if(!map2.isEmpty()){
                max2=Collections.max(list2);
            }else{
                max2=0;
            }
            return max1+max2;
        }
        
    }
