class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """ 
        map1 = []
        map2 = []
        for e in s:
            map1.append(s.index(e))
        for e in t:
            map2.append(t.index(e))
        if map1 == map2:
            return True
        return False
            