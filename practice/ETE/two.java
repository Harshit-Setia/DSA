import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t!=0) {
            
            int n=sc.nextInt();
            int step=1;
            while(true){
                if((n-step)>=0){
                    n-=step;
                    step++;
                }
                else{
                    System.out.println(n<0?step:step-1);
                    break;
                }
            }
            t--;
        }
        sc.close();
    }
}
