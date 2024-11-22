import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortArr = emergency.clone();
        
        Arrays.sort(sortArr);
        
        int rank = 1;
        for(int j=(sortArr.length)-1; j>=0; j--){
            for(int k=0; k<emergency.length; k++){
                if(sortArr[j] == emergency[k]){
                    answer[k] = rank++;
                    break;
                }
            }
        }
        
        return answer;
    }
}