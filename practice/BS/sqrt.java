import java.util.Scanner;

public class sqrt {
    static int sq(int start,int end,int ans,int n){
        if(start>end)return ans;
        int mid=(start+end)/2;
        long mul=(long)mid*mid;
        if(mul<=n){
            ans=mid;
            return sq(mid+1,end,ans,n);
        }
        else{
            return sq(start,mid-1,ans,n);
        }
    }
    static int sq(int n){
        return sq(1, n, 1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sq(n));
        sc.close();
    }    
}