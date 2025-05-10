public class sumOfN {
    public static int sum(int i){
        if(i==1){
            return 1;
        }
        return i+sum(i-1);
    }
    public static void sum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
        sum(10,0);
    }
}
