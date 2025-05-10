public class oneToN_BACK {
    public static void one_to_n(int n,int i)/*Can't Use Default Peramiters in java*/{
        if(i<1){
            return;
        }
        one_to_n(n,i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        one_to_n(4,4);
    }
}
