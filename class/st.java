import java.util.Arrays;

class Stack{
    int top,size;
    int s[];
    public Stack(){
        top=-1;
        size=5;
        s=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        s[++top]=val;
    }
    public void display(){
         System.out.println(Arrays.toString(s));
    }
    int top(){
        return s[top];
    }
    int pop(){
        int val =s[top--];
        return val;
    }
}
public class st {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.display();
        System.out.println(s.pop());
        System.out.println(s.top());
    }
}
