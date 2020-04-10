/*
//168. Excel表列名称
//
//给定一个正整数，返回它在 Excel 表中相对应的列名称。
*/

class Solution {
    public String convertToTitle(int n) {
        int a = 26, b = n , c = n, d = 0, length = 0;
        int[] buffer = new int[8];
        while (c > 0) {
            b = c;
            c = b / a;
            d = b - c * a;
            if (d == 0) c--;
            buffer[length++] = d;
        }
        //if (length == 0 || buffer[length-1] != 0 || --b > 0) buffer[length++] = b;
        String ans = new String();
        char translate = 'A';
        while (--length >= 0) {
            switch (buffer[length]) {
                case 0: translate = 'Z';break;
                case 1: translate = 'A';break;
                case 2: translate = 'B';break;
                case 3: translate = 'C';break;
                case 4: translate = 'D';break;
                case 5: translate = 'E';break;
                case 6: translate = 'F';break;
                case 7: translate = 'G';break;
                case 8: translate = 'H';break;
                case 9: translate = 'I';break;
                case 10: translate = 'J';break;
                case 11: translate = 'K';break;
                case 12: translate = 'L';break;
                case 13: translate = 'M';break;
                case 14: translate = 'N';break;
                case 15: translate = 'O';break;
                case 16: translate = 'P';break;
                case 17: translate = 'Q';break;
                case 18: translate = 'R';break;
                case 19: translate = 'S';break;
                case 20: translate = 'T';break;
                case 21: translate = 'U';break;
                case 22: translate = 'V';break;
                case 23: translate = 'W';break;
                case 24: translate = 'X';break;
                case 25: translate = 'Y';break;
            }
            ans += translate;
        }
        return ans;
    }
}
