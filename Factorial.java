 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger answer = BigInteger.valueOf(1);
        BigInteger temp = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            temp = answer.multiply(BigInteger.valueOf(i));
            answer = temp;
        }
        return answer;
    }

}
