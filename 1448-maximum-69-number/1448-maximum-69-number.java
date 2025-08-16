class Solution {
    public int maximum69Number(int num) {
        int temp = num;
        int pos = -1, i = 0;
        while (temp > 0) {
            if (temp % 10 == 6)
                pos = i;
            temp = temp / 10;
            i++;
        }
        return (int) (num + 3 * Math.pow(10, pos));
    }
}
