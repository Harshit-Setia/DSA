import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                int count=0;
                int temp=i;
                while (temp != 0) {
                    if ((temp & 1) == 1) {
                        count++;
                    }
                    temp >>= 1;
                }
                System.out.print(count+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
