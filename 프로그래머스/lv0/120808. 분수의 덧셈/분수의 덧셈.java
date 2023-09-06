class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            
        // 분자 더해줌
        int finNumer = numer1*denom2 + numer2*denom1;
        
        // 분모를 맞춰주기
        int finDenom = denom1*denom2;
        
        // 기약 분수가 아닐 경우
        for(int i=finNumer;i>1;i--){
            if(finDenom%i==0 && finNumer%i==0){
                finDenom/=i;
                finNumer/=i;
            }
        }
        
        int []result = {finNumer,finDenom};
        return result;
        
    }
}