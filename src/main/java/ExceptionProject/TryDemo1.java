package ExceptionProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo1 {
    public static void main(String[] args){
        int one = 12;
        int two =2;
        System.out.println(one/two);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        one = input.nextInt();
        System.out.println("请输入第二个整数");
        two = input.nextInt();
        try{
            System.out.println(one/two);
        }catch (ArithmeticException e){
            System.exit(1);
            System.out.println("除数不允许为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
        }



    }
}
