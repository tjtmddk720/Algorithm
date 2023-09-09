class Solution {
    public int solution(int n) {
        int num = 1;
        while(num*6%n!=0){
            num+=1;
        }
        return num;
    }
}