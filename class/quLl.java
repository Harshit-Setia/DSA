class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class quLl {
    Node head;
    Node tail;
    quLl(){
        head=tail=null;
    }
    void push(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
            tail.next=null;
        }
    }
    boolean isEmpty(){
        if(head==null)return true;
        return false;
    }
    int size(){
        if(isEmpty())return 0;
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    int pop(){
        if(isEmpty())return -1;
        int val=head.data;
        head=head.next;
        return val;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        quLl q1=new quLl();
        System.out.println(q1.pop());
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.display();
        System.out.println(q1.size());
        System.out.println(q1.pop());
        q1.display();
        System.out.println(q1.size());

    }
}

