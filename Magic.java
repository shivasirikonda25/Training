public class Magic
{
    public static boolean check(int[][] arr)
    {
        int prev=-1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[i][j];
            }
            if(prev!=-1&&sum!=prev) return false;
            prev=sum;
        }
        int yy=prev;
        prev=-1;
        for(int j=0;j<n;j++)
        {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i][j];
            }
            if(prev!=-1&&sum!=prev&&sum!=yy) return false;
            prev=sum;
        }
        int a=0;
        int b=0;
        int t=0;
        while(a<n&&b<n)
        {
            t+=arr[a++][b++];
        }
        if(t!=prev&&t!=yy) return false;

        int c=n-1,d=0;
        int u=0;
        while(d<n&&c>=0)
        {
            u+=arr[c--][d++];
        }
        if(u!=prev&&u!=yy) return false;

        return true;

    }
    public static void main(String[] args)
    {
        int[][] ch={{4,3,8},{9,5,1},{2,7,6}};
        if(check(ch)) System.out.println("yesssssss");
        else System.out.println("noooooo");
    }
}
