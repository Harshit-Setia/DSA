class SinglyLinkedList{
    class Node {
        int num;
        Node next;
        Node(int num){
            this.num=num;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    public SinglyLinkedList(){

    }
    void insertBegin(int num){
        Node n=new Node(num);
        n.next=head;
        head=n;
    }
    void delBegin(){
        head=head.next;
    }
    void insertPosition(int idx,int num){
        if(idx<1){
            System.out.println("idx can't be negative");
            return;
        }
        if(idx==1){
            insertBegin(num);
            return;
        }
        Node temp=head;
        for(int i=1;i<idx-1;i++){
            if(temp!=null){
                temp=temp.next;
            }
            else{
                System.out.println("out of range");
                return;
            }
        }
        Node n=new Node(num);
        n.next=temp.next;
        temp.next=n;
    }
    void insertLast(int num){
        Node n=new Node(num);
        if(head==null){
            head=tail=n;
        }
        tail.next=n;
        tail=n;
        tail.next=head;   
    }
    void delLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void dispaly(){
        Node temp=head;
        do {
            System.out.println(temp.num);
            temp=temp.next;
        }while (temp!=head);
    }

    void rev() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move prev to current
            current = next; // Move to next node
        }

        tail = head; // Update tail
        head = prev; // Update head to new first node
    }
    
}

public class ll {
    public static void main(String[] args) {
        SinglyLinkedList s1=new SinglyLinkedList();
        s1.insertLast(1);
        s1.insertLast(2);
        s1.insertLast(3);
        s1.insertLast(4);
        // s1.insertBegin(0);
        // s1.delBegin();
        // s1.insertPosition(1, 10);
        s1.dispaly();
        // s1.rev();
        // System.out.println();
        // s1.dispaly();
    }
}
