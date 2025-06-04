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
            head=tail=x;
            return;
        }
        x.next=head;
        head=x;
    }

    //popFront


    //pushBack
    void pushBack(int data){
        Node x=new Node(data);
        if(head==null){
            head=tail=x;
            return;
        }
        //without tail
        /*Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x;*/

        //with tail
        tail.next=x;
        tail=x;
    }

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
