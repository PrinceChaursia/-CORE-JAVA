import java.util.Scanner;
public class ifelse{
    public static void main (String []args){

        int a, b, c;
        System.out.println("Enter the values of a,b,and c");
        Scanner sc = new Scanner (System.in);
        
        a= sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();

        if (a>b && b>c)
        {
        System.out.println("A  is greater then B   and   C");
        }
        else if (b>c && c>a)
        {
            System.out.println("B is greater then A    and    C");
        }
        else if (c>b && b>a)
        {
            System.out.println("C is Greater then A   and    B");
        }
    }
}
//_______________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________

// import java.util.Scanner;
// class Decisionstructure
// {
//     public static void main(String[] args) {
    
//         // if (True block)
// //         int  age ;
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter age ");
//         age = sc.nextInt();
//         if(age>=18)
//         {
//             System.out.println("Ready to vote");

//         }
//         else if (age == 18)
//         {
//         System.out.println("Congrate for First time Vote");
//         }

//       else if (age < 18)
//       {
//         System.out.println("Not ready for vote");
//       }
//      }
//    }

