//Return last digit of the given number
import java.util.Scanner;
public class Lastdigit{
public static void main(String[] args){
   Scanner sc=new Scanner (System.in);
   int input1=Math.abs(sc.nextInt());
   System.out.println(input1%10);
   }
}