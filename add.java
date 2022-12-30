import java.util.Scanner;
public class add {
public static void main(String []args)
 {
    int a,b,result;
    System.out.println("enter the value of a and b");
    Scanner cs = new Scanner (System.in);
 
    a= cs.nextInt();
   b= cs.nextInt();

    result = (a+b);

     System.out.println("answer=="    +result);
 }
}
