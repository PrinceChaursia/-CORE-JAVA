import java.util.Scanner;
class Decisionstructure
{
    public static void main(String[] args) {
    
        // if (True block)
//         int  age ;
        Scanner sc = new Scanner (System.in);
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

System.out.println("Enter trhe days");
int Choice = sc.nextInt();
switch (Choice) {
    case 1 :
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;

        case 4:
        System.out.println("Thrusday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        case 8:
        System.out.println("Invalid day");
        break;
}
    }
}