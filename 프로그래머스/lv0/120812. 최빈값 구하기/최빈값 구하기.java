import  java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        
        // count로 빈도 체크
        // 최빈도는 max 변수를 두어 비교
        int count=1;
        int max=1;
        int num=array[0];
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=array[i+1]){
                count=1;
            }
            else count++;
            
            if(max<count){
                max = count;
                num = array[i];
            }
            else if(max==count){
                num = -1;
            }
        }
        return num;
    }
}