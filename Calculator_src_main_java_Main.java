import Methods.*;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        double num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations Available");
        System.out.println("Addition\nSubtraction\nMultiplication\nDivision");
        while (true) {
            System.out.println("Enter two numbers and an operator with spaces (num1,num2 and op)");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            op = sc.next();
            double c=Calculation.getValue(num1,num2,op);
            System.out.println(num1+" "+op+" "+num2+" = "+c);
            System.out.println("Do you want to continue (yes/no)");
            if(sc.next().equals("no")){
                break;
            }
        }
    }
}
