class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Freq[] = new int[26];
        int n = s1.length(), m = s2.length();

        for (int i = 0; i < n; i++)
            s1Freq[s1.charAt(i) - 'a']++;

        int windSize = n;
        for (int j = 0; j < m; j++) {
            int windFreq[] = new int[26];
            int windIdx = 0, idx = j;
            while (windIdx < windSize && idx < m) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++;
                idx++;
            }
            if (isSame(s1Freq, windFreq))
                return true;
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