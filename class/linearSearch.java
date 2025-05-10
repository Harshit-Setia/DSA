public class linearSearch {
    //1
    public static int idxOfArr(int []arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    //2
    public static boolean inArr(int []arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    //3
    public static int maxArr(int arr[]){
        int max=arr[0];
        for(int i:arr){
            if(max<i)max=i;
        }
        return max;
    }
    //4
    public static int firstIdx(int []arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    //5
    public static int countOfK(int []arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
    //6
    public static int sumOfLargerThanK(int []arr,int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                sum+=arr[i];
            }
        }
        return sum;
    }
    //7
    public static int minArr(int arr[]){
        int min=arr[0];
        for(int i:arr){
            if(min>i)min=i;
        }
        return min;
    }
    //8
    public static int secondMaxArr(int arr[]){
        int max=arr[0];
        int sMax=-1;
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(sMax<i&&i<max){
                sMax=i;
            }
        }
        return sMax;
    }
    //9
    public static void largerThanAvg(int []arr,int k){
        int avg=0;
        for(int i:arr){
            avg+=i;
        }
        avg/=arr.length;
        for(int i:arr){
            if(i>avg){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    //11
    public static void dublicatesInArr(int arr[]){
        int max=arr[0];
        for(int i:arr){
            if(i>max)max=i;
        }
        int []fr=new int[max+1];
        for(int i:arr){
            fr[i]++;
        }
        for(int i=0;i<=max;i++){
            if(fr[i]>=2){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,6,4,5};
        int k=4;

        System.out.println(idxOfArr(arr, k));
        System.out.println(inArr(arr, k));
        System.out.println(maxArr(arr));
        System.out.println(firstIdx(arr, k));
        System.out.println(countOfK(arr, k));
        System.out.println(sumOfLargerThanK(arr, k));
        System.out.println(minArr(arr));
        System.out.println(secondMaxArr(arr));
        largerThanAvg(arr, k);
        dublicatesInArr(arr);


    }
}
