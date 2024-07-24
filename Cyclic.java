import java.util.*;
public class Cyclic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int[] res=new int[n];
        int r=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ind=(i+r)%n;
            res[i]=arr[ind];
        }
        for(int i=0;i<n;i++) System.out.println(res[i]+" ");
    }
}
