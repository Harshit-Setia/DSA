public class nToOne {
    public static void n_to_one(int n,int i)/*Can't Use Default Peramiters in java*/{
        if(i==0){
            return;
        }
        System.out.println(i);
        n_to_one(n,--i);
    }
    public static void main(String[] args) {
        n_to_one(4,4);
    }
}
