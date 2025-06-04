public class LinkedList {
    Node head;
    Node tail;

    LinkedList(){
        head=tail=null;
    }

    //pushFront
    void pushFront(int data){
        Node x=new Node(data);
        if(head==null){
            head=x;
            head.next=tail;
            return;
        }
        x.next=head;
        head=x;
    }

    //popFront


    //pushBack


    //popBack


    //toString
    public String toString(){
        StringBuilder sb=new StringBuilder();
        Node temp=head;
        while(temp!=null){
            sb.append(temp.data+" ");
            temp=temp.next;
        }
        return sb.toString().trim();
    }
}
