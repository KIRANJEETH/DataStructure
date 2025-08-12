package nonlinear;
import java.io.*;
import java.util.*;
public class SumOfDigits{
    static int SumOfDigit(int n)
    { 
        if (n == 0)
            return 0;
        return (n % 10 + SumOfDigit(n / 10));
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int result = SumOfDigit(num);
        System.out.println(result);
    }
}