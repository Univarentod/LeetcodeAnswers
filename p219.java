/*
//219. 存在重复元素 II
//
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索
//引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
*/

class Solution {
    private class LinkedNode {
        int val;
        int index;
        LinkedNode next;
        LinkedNode(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        k++;
        int length = nums.length;
        LinkedNode[] hashTable = new LinkedNode[length];
        Arrays.fill(hashTable, null);
        for (int i = 0, hashValue = 0, theOne = 0; i < length; i++) {
            theOne = nums[i];
            hashValue = theOne % length;
            if (hashValue < 0) hashValue += length;
            if (hashTable[hashValue] == null) {
                hashTable[hashValue] = new LinkedNode(theOne, i);
            } else {
                LinkedNode iter = hashTable[hashValue];
                if (iter.val == theOne && i-iter.index < k) return true;
                while (iter.next != null) {
                    iter = iter.next;
                    if (iter.val == theOne && i-iter.index < k) return true;
                }
                iter.next = new LinkedNode(theOne, i);
            }
        }
        return false;
    }
}
