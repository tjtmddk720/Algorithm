class Solution {
    public int solution(int slice, int n) {
      int result = 1;
      while(slice*result<n){
              result++;
      }
        return result;
    }
}