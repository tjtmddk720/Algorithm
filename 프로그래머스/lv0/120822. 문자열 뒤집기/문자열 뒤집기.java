class Solution {
    public String solution(String my_string) {
        String reverse = "";
        for(int i=0;i<my_string.length();i++){
            reverse+=my_string.charAt(my_string.length()-i-1);
        }
        return reverse;
    }
}