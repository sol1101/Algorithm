package Programmers;

public class lv1_lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        //로또 최고순위와 최저순위 구하기
        //lottos = 구매한 로또 번호
        //win_nums = 당첨 번호
        int[] answer = new int[2];
        int correct = 0;
        int unknown = 0;
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i]==0){
                unknown ++;
            }
            for(int j = 0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    correct ++;
                }
            }
        }
        answer[0] = 7 - (correct+unknown);
        answer[1] = 7 - correct;
        
        if((correct+unknown)==0){
            answer[0] = 6;
        }
        if(correct ==0){
            answer[1] =6;
        }
        
        return answer;
    }
}