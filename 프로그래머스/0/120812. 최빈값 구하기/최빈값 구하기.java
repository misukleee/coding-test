import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        
        for(int i : array){
            if(cntMap.get(i) == null){
                cntMap.put(i, 1);
            }else{
                cntMap.put(i, cntMap.get(i) + 1);
            }
        }
        
        int max = 0;
        int minus = 0;
        for(int key : cntMap.keySet() ){
            int value = cntMap.get(key);
            if(value>max){
                max = value;
                answer = key;
                minus = 0;
            }else if(value==max){
                minus = -1;
            }
        }
        
        if(minus == -1){
            return minus;
        }else{
            return answer;
        }        
    }
}