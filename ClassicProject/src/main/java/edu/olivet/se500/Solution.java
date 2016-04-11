package edu.olivet.se500;

import java.util.HashSet;
import java.util.Set;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] strarray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            strarray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            strarray[t.charAt(i) - 'a']--;
            if (strarray[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}