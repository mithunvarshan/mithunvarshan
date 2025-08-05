class Solution:
    def removeDuplicates(self, s: str) -> str:
        k=[]
        for i in s:
            if k and k[-1] == i:
                k.pop()
            else:
                k.append(i)
        s = ''.join(k)        
        return s        

        