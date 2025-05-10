import java.util.Scanner;

public class stToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i);
            sb.append(temp);
        }

        String ans = sb.toString();
        
        if(s==""){
            System.out.println((int)('\n'));
        }
        else{
            System.out.println(ans);
        }

        sc.close();
    }
}
