class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!(str1+str2).equals(str2+str1))  {
            return "";
        }
        else {
            int l1 = str1.length();
            int l2 = str2.length();

            int index = gcd(l1, l2);

            return str1.substring(0, index);
        }
    }

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
    
}