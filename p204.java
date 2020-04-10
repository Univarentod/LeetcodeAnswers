/*
//计数质数
//
//统计所有小于非负整数 n 的质数的数量。
*/

class Solution {
    private class LinkedNode {
        int val;
        LinkedNode next;
    }
    private LinkedNode head = new LinkedNode();
    private LinkedNode tail = head;
    private boolean isPrime(int n) {
        LinkedNode iter = head;
        int check = 0, max = (int)Math.sqrt((double)n);
        while (iter != tail) {
            check = iter.val;
            if (check > max) break;
            if (n%check == 0) return false;
            iter = iter.next;
        }
        tail.val = n;
        tail.next = new LinkedNode();
        tail = tail.next;
        return true;
    }
    public int countPrimes(int n) {
        if (n < 3) return 0;
        int count = 1;
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) count++;
        }
        return count;
    }
}
