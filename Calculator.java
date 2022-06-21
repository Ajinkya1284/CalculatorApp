import java.util.Scanner;

public class Calculator
{
    public static int add(int n1,int n2)
    {
        return n1+n2;
    }     

    public static  int mult(int n1,int n2)
    {
        return n1*n2;
    }     

    public  static int div(int n1,int n2)
    {
        return n1/n2;
    }     

    public static  int sub(int n1,int n2)
    {
        return n1-n2;
    }     

    public static int  percentage(int n1,int n2)
    {
        return n1*n2/100;
    }
    public static void main(String args[])
    {
        int ch=0,result=0;
        Scanner sc1=new Scanner(System.in);
        while(ch!=6)
        {
            System.out.println("Enter 2 numbers:");
            int n1=sc1.nextInt();
            int n2=sc1.nextInt();
            System.out.println("1)ADDITION");
            System.out.println("2)SUBSTRACTION");
            System.out.println("3)MULTIPLICATION");
            System.out.println("4)DIVISION");
            System.out.println("5)PERCENTAGE");
            System.out.println("6)EXIT");
            System.out.println("--------------------------");
            System.out.println("Enter your choice");
            ch=sc1.nextInt();
            switch(ch)
            {
                case 1:result=add(n1, n2);
                    break;

                case 2:result=sub(n1, n2);
                    break;

                case 3:result=mult(n1, n2);
                    break;

                case 4:result=div(n1, n2);
                    break;
                case 5:result=percentage(n1, n2);

            }
            System.out.println("RESULT:"+result);
        }
        sc1.close();
    }
}