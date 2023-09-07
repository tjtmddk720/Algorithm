class Solution {
    public int solution(int[] array) {
        
       // 배열을 정렬
        for(int j=0;j<array.length;j++){
            for(int i=j+1;i<array.length;i++){
                if(array[i]<array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        // 중앙에 위치하는 값 찾음
        int order = array.length/2;
        return array[order];
    }
}