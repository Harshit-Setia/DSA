public class revArr {
    public static void rev(int l,int r,int[]arr){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        rev(l+1,r-1,arr);
    }
    public static void rev(int i,int[]arr){
        int n=arr.length;
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        rev(i+1,arr);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,2,1,4};
        rev(0,(arr.length-1),arr);
        rev(0,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
