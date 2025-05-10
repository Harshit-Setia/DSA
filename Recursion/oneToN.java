
public class oneToN {               
    public static void one_to_n(int n,int i)/*Can't Use Default Peramiters in java*/{
        if(i>n){
            return;
        }
        System.out.println(i);
        one_to_n(n,++i);
    }
    public static void main(String[] args) {
        one_to_n(4,1);
    }
}
