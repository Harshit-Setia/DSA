public class dll {
    class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }

    Node head;
    Node tail;

    dll(){
        head=null;
        tail=null;
    }

    void insertBack(int data){
        Node x=new Node(data);
        if(head==null){
            head=tail=x;
        }
        else{
            tail.next=x;
            x.prev=tail;
            tail=x;
        }
    }

    void insertFront(){
        
    }

    void log(){
        System.out.println("Print using Next");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Printing Using Prev");
        temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dll ll=new dll();
        int arr[]={1,2,34,5,5,7,8,4,56,32};
        for(int i=0;i<arr.length;i++){
            ll.insertBack(arr[i]);
        }
        ll.log();
    }
}
