public class Numbers {
    int N,Num,Prev,Arr[][];

    Numbers(int a, int b)
    {
        N=a;
        Arr = new int[N][N];
        Num=b;
    }

    Numbers check(int n)
    {
        int sum=0;
        boolean flg = false;
        for(int i=Num;i<n;i++)
        {
            sum+=i;
            if(sum==n)
                flg = true;
        }
        
        if(flg)
            return new Numbers(N,n);

        return new Numbers(N, Num);
    }
}
