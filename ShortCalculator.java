 


public class ShortCalculator {
    short sum;
    short difference;
    short product;
    short quotient;
    short remainder;
    
    
    public ShortCalculator(short input1, short input2){
        sum = (short) (input1 + input2);
        difference = (short) (input1 - input2);
        product = (short) (input1 * input2);
        quotient = (short) (input1 / input2);
        remainder = (short) (input1 % input2);
    }
    
    public short getSum(){
        return sum;
    }
    
    public short getDifference(){
        return difference;
    }
    
    public short getProduct(){
        return product;
    }
    
    public short getQuotient(){
        return quotient;
    }
    
    public short getRemainder(){
        return remainder;
    }
}
