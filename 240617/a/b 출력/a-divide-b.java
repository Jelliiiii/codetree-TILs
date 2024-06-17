import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputA = scanner.next();
        String inputB = scanner.next();
        
        BigDecimal a = new BigDecimal(inputA);
        BigDecimal b = new BigDecimal(inputB);
        
        MathContext mc = new MathContext(30, RoundingMode.DOWN);
        
        BigDecimal result = a.divide(b, mc);
        
        BigDecimal finalResult = result.setScale(20, RoundingMode.DOWN);
        
        System.out.println(finalResult);
        
        scanner.close();
    }
}