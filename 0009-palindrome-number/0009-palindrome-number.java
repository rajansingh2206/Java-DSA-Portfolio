class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversed = 0;
        // Reverse half the digits
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // For even digits: x == reversed
        // For odd digits: x == reversed/10 (middle digit ignored)
        return x == reversed || x == reversed / 10;
    }
}