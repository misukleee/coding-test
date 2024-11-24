import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] letterArr = letter.split(" ");
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String l : letterArr){
            for(int i=0 ; i<morse.length; i++){
                if(l.equals(morse[i])){
                    char c = (char)(i+97);
                    answer += c;
                    break;
                }
            }
        }
        return answer;
    }
}