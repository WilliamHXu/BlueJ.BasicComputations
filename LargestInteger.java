 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int answer;
        if (integers[0] > integers[1]) {
            answer = (integers[0] > integers[2]) ? integers[0]: integers[2];
        }
        else {
            answer = (integers[1] > integers[2]) ? integers[1]: integers[2];
        }
        return answer;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return Math.max(Math.max(integers[0], integers[1]), integers[2]);
    }
    
    
}
