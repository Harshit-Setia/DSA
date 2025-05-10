import java.util.Scanner;

public class nthRoot {
    static int nRoot(int start,int end,int pow,int ans,int n){
        if(start>end)return -1;
        int mid=(start+end)/2;
        long mul=1;
        for(int i=0;i<pow;i++){
            mul*=mid;
            if(mul>n)break;
        }
        if(mul==n)return mid;
        else if(mul<n)return nRoot(mid+1, end, pow, ans, n);
        else return nRoot(start, mid-1, pow, ans, n);
    }
    static int nRoot(int pow,int n){
        return nRoot(1, n, pow, 1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow=sc.nextInt(), n=sc.nextInt();
        System.out.println(nRoot(pow, n));
        sc.close();
    }
}