class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mapOne = {}
        mapTwo = {}

        for char in s: 
            if char not in mapOne: 
                mapOne[char] = 1
            else: 
                mapOne[char] += 1

        for char in t: 
            if char not in mapTwo: 
                mapTwo[char] = 1
            else: 
                mapTwo[char] += 1
            
        return mapOne == mapTwo
        