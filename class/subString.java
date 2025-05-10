import java.util.Scanner;

public class subString {
    // public static boolean()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(inp);
        sb.append(inp);

        String sub=sb.substring(1, sb.length()-1);

        System.out.println(sub.contains(inp));

        sc.close();


        // for(int i=0;i<len;i++){
        //     if(canBeSub(sb,len)){

        //     }
        // }
        // canBeSub(sb,len);
    }
}
