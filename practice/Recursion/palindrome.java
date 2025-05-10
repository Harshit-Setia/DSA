public class palindrome {
    public static boolean isPal(int i,String s){
        int n=s.length();
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        if(i>n/2){
            return true;
        }
        return isPal(i+1,s);
        
    }
    public static void main(String[] args) {
        String s="helleh";
        System.out.println(isPal(0, s));
    }
}
