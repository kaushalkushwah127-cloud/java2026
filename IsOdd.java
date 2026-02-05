import java.util.Scanner;
public class IsOdd{
  public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    int num=Math.abs(sc.nextInt());
    if (num%2==0) return 1;
    else return 2;
  }
}
    