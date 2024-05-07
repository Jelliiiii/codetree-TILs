import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt(), w = sc.nextInt();
        double b = (10000 * w)/(h * h);
        int bb = (int)Math.floor(b);
        if(bb>=25){
            System.out.printf(bb + "\n" + "Obesity");
        }else{
            System.out.printf(bb + "\n" + "Normal");
        }
        sc.close();
        // 여기에 코드를 작성해주세요.
    }
}