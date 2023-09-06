class Solution {
    public int solution(int n, int k) {
        if(n/10>0) k-=n/10;
        return n*12000 + k*2000;
    }
}