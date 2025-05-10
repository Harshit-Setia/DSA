class DoublyLinkedList{
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
    Node head=null;
    public DoublyLinkedList(){
        
    }
    void insertFront(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
        }
        else{
            head.prev=n;
            n.next=head;
            head=n;
        }
    }
    void dispalyFront(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    void dispalyBack(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
        System.out.println();
    }
}

public class dll {
    public static void main(String[] args) {
        DoublyLinkedList d1=new DoublyLinkedList();
        d1.insertFront(0);
        d1.insertFront(1);
        d1.insertFront(2);
        d1.dispalyFront();
        d1.dispalyBack();
    }

}
