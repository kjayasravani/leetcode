class Solution {
    public String shortestPalindrome(String s) {
    String concat = new StringBuilder(s).append('.').append(new StringBuffer(s).reverse()).toString();
    int[] next = new int[concat.length()];
    for (int i = 0, ptr = -1; i < next.length; ptr = next[i], i++) {
        while (ptr > -1 && concat.charAt(ptr + 1) != concat.charAt(i)) ptr = next[ptr];
        next[i] = i > 0 && concat.charAt(ptr + 1) == concat.charAt(i) ? ptr + 1 : -1;
    }
    return new StringBuilder(s.substring(next[next.length - 1] + 1, s.length())).reverse().append(s).toString();
}

}