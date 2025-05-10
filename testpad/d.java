// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Result{
    void printNextGreaterElement(int arr[],int n){
    // Write your code here
      for(int i=0;i<n;i++){
          boolean found = false;
          for(int j=i+1;j<n;j++){
              if(arr[i]<arr[j]){
                  System.out.print(arr[j]+" ");
                  found=true;
                  break;
              }
          }
          if(!found)System.out.print(-1+" ");
      }
  }
}
public class d
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    Result result = new Result();
    int t = s.nextInt();
    while(t-- > 0){
      int n;
      n = s.nextInt();
      int arr[] = new int[n];
      int i=0;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      result.printNextGreaterElement(arr,n);
      System.out.println();
      s.close();
    }
  }
}