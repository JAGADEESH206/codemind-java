import java.util.Scanner;
public class Example{
public static void main(String args[])
   {
       int a,b,c;
       //an object of scanner class
       Scanner read = new Scanner(System.in);
       a = read.nextInt();
       b = read.nextInt();
       c=a*b;
      System.out.println(c);
    }
}