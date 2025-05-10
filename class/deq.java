class Node{
    Node prev;
    int data;
    Node next;
    public Node(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
}
public class deq {
    Node head;
    Node tail;
    deq(){
        head=tail=null;
    }
    void push_front(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    void push_back(int data){
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
    int pop_front(){
        if(isEmpty())return -1;
        int val=head.data;
        head=head.next;
        return val;
    }
    int pop_back() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int val = head.data;
            head = null;
            return val;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        if(head==null)System.out.println("Queue is empty");
        else System.out.println();

    }

    public static void main(String[] args) {
        deq q1=new deq();
        System.out.println(q1.pop_front());
        q1.push_back(1);
        q1.push_back(2);
        q1.push_back(3);
        q1.push_front(0);
        q1.display();
        System.out.println(q1.pop_back());
        q1.display();
        System.out.println(q1.size());

    }
}