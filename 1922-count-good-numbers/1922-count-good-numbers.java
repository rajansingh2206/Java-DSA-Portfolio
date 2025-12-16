class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even_count = (n + 1) / 2;
        long odd_count = n / 2;
        long ans = Pow(5, even_count, MOD) * Pow(4, odd_count, MOD) % MOD;
        return (int) ans;
    }

    private long Pow(long base, long exp, long MOD) {
        long ans = 1;
        base = base % MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = ans * base % MOD;
            }
            base = base * base % MOD;
            exp >>= 1;
        }
        return ans;
    }
}