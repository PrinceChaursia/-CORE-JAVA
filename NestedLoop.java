public class NestedLoop{
    public static void main(String [] args) {
//        for  (int i = 0; i < 5; i++) //resd 5 Chapters (Task)
//         {
//             System.out.println("Task  "+i);
//             for (int j = 0; j < 5;j++)
//             {
//                 System.out.print("{Subtask "+j+"      " );
//             }
//         System.out.println();
//         }
//     }
// }

// //*         (Answer)
// //**
// //***
// //****
// //***** 

//     for  (int i = 0; i < 6; i++)
//     {
//     for  (int j = 0; j < i; j++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
// }

for  (int i = 1; i<=5; i++)
{
    for  (int j = 1; j<=i; j--)
    {
        System.out.print("*");
    }
    System.out.println();
    for  (int k = 1; k<=5; k++)
{
        System.out.print("#");
    }
    System.out.println();
  }
    }
}