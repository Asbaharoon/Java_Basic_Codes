class Solution {
    public int maxPower(String s) {
        
        int ans = 1;
        int count = 1;
        
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1))
                count++;
            else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
}
