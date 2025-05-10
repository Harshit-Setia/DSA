import java.util.Scanner;

public class nF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int plntCanPlanted=0;
        int zCount=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                zCount++;
            }
            else{
                zCount=0;
            }
            if(zCount==3){
                plntCanPlanted++;
                zCount=1;
            }
        }
        int count=sc.nextInt();
        if(count>plntCanPlanted){
            System.out.println("No-"+count);
        }
        else{
            System.out.println("Yes-"+count);
        }
        sc.close();
    }
}
