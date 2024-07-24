import java.util.*;
public class Main {

    public static void check(String s1,String s2)
    {
        if(s1.equals(s2)) System.out.println("yes! both strings are equal");
        else  System.out.println("no! both strings are not equal");
    }
    public static void flip_a_coin(int n)
    {
        Random r=new Random();
        double tail=0;
        for(int i=0;i<n;i++) {
            double t = r.nextDouble();
            if(t<0.5)
            {
                tail++;
            }
        }
        double per_tails=(tail/n*1.0)*100;
        double per_heads=100-per_tails;
        System.out.println("tails percentage is "+ per_tails);
        System.out.println("heads percentage is "+ per_heads);

    }
    public static  void check_leap_year(int year)
    {
        if(year%400==0||(year%4==0&&year%100!=0))
        {
            System.out.println("year :"+year+" is a leap year");
        }
        else System.out.println("year :"+year+" is not  a leap year");
    }
    public static void power_of_2(int n)
    {
        if(n>=32)
        {
            System.out.println("integer overflow");
            return;
        }
        int t=1;
        for(int i=0;i<=n;i++)
        {
            System.out.println("2 to the power of " +i +": is"+t);
            t=t*2;
        }


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enjoy pandagowww");
//        PrimitiveDatatypes p=new PrimitiveDatatypes();
//    // for primitive values
//        p.fun();
//        System.out.println("enter two strings to check ");
//        System.out.println("enter string 1:");
//        String s1=sc.next();
//        System.out.println("enter String 2: ");
//        String s2=sc.next();
//        check(s1,s2);
//
//        System.out.println("enter number of times u want to flip a coin ");
//        flip_a_coin(sc.nextInt());
//        System.out.println("enter the year u want to check ");
//        check_leap_year(sc.nextInt());
//        System.out.println("enter the value of n");
//       int n= sc.nextInt();
//       power_of_2(n);
//       System.out.println("enter both length and breadth ");
//       int l=sc.nextInt();
//       int b=sc.nextInt();
//       Rectangle r=new Rectangle(l,b);
//       System.out.println("perimeter is"+r.perimeter(l,b)+" "+"area is "+ r.area(l,b));
//       System.out.println("enter the name of the student");
//       String name=sc.next();
//       System.out.println("enter the age of the student");
//       int age=sc.nextInt();
//        System.out.println("enter the  studentID");
//        int studentID=sc.nextInt();
//        System.out.println("enter the grade of the student");
//        char grade = sc.next().charAt(0);
//       Student s=new Student(studentID,name,age,grade);
//       s.display();
        StringBuilder sb=new StringBuilder("shiva");
        sb.replace(1,2,'i'+"");
        sb.delete(1,sb.length());
        System.out.println(sb.toString());

    }
}