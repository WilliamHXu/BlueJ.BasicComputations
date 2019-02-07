 
import java.util.Scanner;

public class IntegerPrinter {

    public static String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public static String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public static String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    public static void main(String[] args){
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.print(printIntegerAsBinary(x));
    }
    
}
