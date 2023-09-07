class Solution {
    public int[] solution(int n) {  
      int length = 0;
      if(n%2==0) length = n/2;
      else length = n/2+1;
        
      int[] result = new int[length];
        int num = 1;
        for(int i=0;i<length;i++){
            result[i] = num;
            num+=2;
        }
        return result;
    }
}