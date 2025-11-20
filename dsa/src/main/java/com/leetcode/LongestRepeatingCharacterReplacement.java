package com.leetcode;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int output = 0;
        int left = 0;
        int[] freq = new int[26];
        int maxFreq = 0;

        for(int right=0;right<s.length();right++)
        {
            int rightIndex = s.charAt(right) - 'A';
            freq[rightIndex]++;

            maxFreq = Math.max(freq[rightIndex], maxFreq);

            while((right-left+1) - maxFreq > k)
            {
                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;
                left++;
            }

            output = Math.max(output, right-left+1);

        }

        return output;
    }
}
