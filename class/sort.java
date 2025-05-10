import java.util.Arrays;

class mSort{
    public void m(int []arr1,int []arr2){
        int n=arr1.length;
        int m=arr2.length;
        int []ans=new int [n+m];
        int i=0;
        int j=0;
        int idx=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                ans[idx++]=arr1[i];
                i++;
            }
            else{
                ans[idx++]=arr2[j];
                j++;
            }
        }
        while(i<n){
            ans[idx++]=arr1[i];
            i++;
        }
        while(j<m){
            ans[idx++]=arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}

public class sort {

    public static int bubbleSort(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return count;
    }
    public static void bubbleSortStr(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].charAt(0) < arr[j + 1].charAt(0)) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int start=i;
            while(start>0 && arr[start]<arr[start-1]){
                int temp=arr[start];
                arr[start]=arr[start-1];
                arr[start-1]=temp;
                start--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={64,22,32,22,25,11,25,25};

        // int numOfSwaps = bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        // String []arr2={"mango","grapes","orange"};
        // bubbleSortStr(arr2);
        // System.out.println(Arrays.toString(arr2));
        
        // mSort m1=new mSort();
        // int []arr1={1,2,5,6};
        // int []arr2={3,4,7};
        // m1.m(arr1, arr2);
}
}