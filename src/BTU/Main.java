package BTU;

import java.util.Scanner;
public class Main extends A{
    int y;

    public void Method1(){
        System.out.println("Please Enter y : ");
        Scanner inpObj = new Scanner(System.in);
        y = inpObj.nextInt();
    }
    public int Method2(){
        System.out.println("x + y = ");
        return x+y;
    }
}