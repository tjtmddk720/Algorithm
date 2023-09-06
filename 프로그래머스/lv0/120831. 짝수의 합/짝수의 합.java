class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            sum+=2*i;
        }
        return sum;
    }
}