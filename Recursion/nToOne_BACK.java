public class nToOne_BACK {
    public static void n_to_one(int n,int i)/*Can't Use Default Peramiters in java*/{
        if(i>n){
            return;
        }
        n_to_one(n,i+1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        n_to_one(4,1);
    }
}
