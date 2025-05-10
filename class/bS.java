public class bS {
        public static int bs(int []arr,int s,int e,int t){
            if(s>e)return -1;
            int mid=(e+s)/2;
            if(arr[mid]>t){
               return bs(arr,s,mid-1,t);
            }
            else if(arr[mid]<t){
               return bs(arr , mid+1,e,t);
            }
            else{
                return mid;
            }
        }
           
        public static void main(String[] args) {
            int []arr={0,2,3,3,4,5,6,7,8,9};
            //1
            System.out.println(bs(arr, 0, arr.length-1, 0));
            //2
            int idx=bs(arr, 0, arr.length-1, 3);
            int end=idx;
            for(;end<arr.length;end++){
                if(arr[end]!=arr[idx]){
                    break;
                }
            }
            System.out.println(idx+" "+(end-1));
        }
}
