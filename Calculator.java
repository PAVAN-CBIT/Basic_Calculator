public static void main(String[]args)
    {
        
        
        int a,b,c,d;
        a=1;
        b=2;
        c=3;
        d=4;
         System.out.println("Enter correct Number");
        System.out.println("1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division");
        Scanner in=new Scanner(System.in);
        int operation;
        operation = in.nextInt();
         System.out.println(operation);
         int op=operation;
             if(op==1)
             {
                addition(a,b);
                 
             }
               
             else if(op==2)
                {
                    subtraction(b,a);
                         
                }
                else if(op==3)
                {
                     multiplication(a,b);
                    
            }
        else if(op==4)
        {
            division(a,b);
        }
        else
        {
            System.out.println("You entered incorrect number:EXIT");
        }
    }
}
