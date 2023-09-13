class Solution {
    public String solution(String my_string, int n) {
     // 각 문자를 n만큼 반복
        String result ="";
        for(int j=0;j<my_string.length();j++){
            for(int i=0;i<n;i++){
                result+=my_string.charAt(j);
            }
        }
        return result;
    }
}