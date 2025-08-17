class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Freq[] = new int[26];
        int windFreq[] = new int[26];
        int n = s1.length(), m = s2.length();

        if(n>m) return false;
        for (int i = 0; i < n; i++)
        {
            s1Freq[s1.charAt(i) - 'a']++;
            windFreq[s2.charAt(i)-'a']++;
        }
        if(isSame(s1Freq,windFreq)) return true;

        for (int j = n; j < m; j++) {
            windFreq[s2.charAt(j)-'a']++;
            windFreq[s2.charAt(j-n)-'a']--;
            if(isSame(s1Freq,windFreq)) return true;
        }
        return false;
    }

    private boolean isSame(int s1[], int s2[]) {
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }
}