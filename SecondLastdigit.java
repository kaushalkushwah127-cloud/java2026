

//Return second last digit of given number
import java.util.Scanner;
public class SecondLastdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int input1=sc.nextInt();
        if (input1<10 && input1 > -10) {System.out.println("-1"); return;}
        System.out.println(Math.abs((input1/10)%10));
    }
}