/*
//172. 阶乘后的零
//
//给定一个整数 n，返回 n! 结果尾数中零的数量。
*/

class Solution {
    public int trailingZeroes(int n) {
        if (n < 5) return 0;
        int fives = n / 5;
        return fives + trailingZeroes(fives);
    }
}
