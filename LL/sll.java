public class sll {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    /* insert an node */
    // at Back
    void insertBack(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // at Start
    void insertFront(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    /* removing Node */
    // start

    void popFront() {
        if (head != null) {
            head = head.next;
            return;
        }
        System.out.println("List is Empty");
    }

    // back
    void popBack() {
        if (head != null) {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail=temp;
            return;
        }
        System.out.println("ll is empty");
    }


    int size(){
        if(head==null)return 0;
        int s=1;
        Node temp=head;
        while(temp!=tail){
            s++;
            temp=temp.next;
        }
        return s;
    }

    int find(int t){
        Node temp=head;
        if(temp==null)return -1;
        int i=0;
        while(temp!=null){
            if(temp.val==t)return i;
            i++;
            temp=temp.next;
        }
        return -1;
    }

    void revListIt(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        // if(head.next==null){
        //     Node temp=head;
        //     head.next=null;
        //     tail.next=head;
        //     head=tail;
        //     tail=temp;
        // }
        Node prev=null;
        Node curr=head;
        Node nextt=null;
        tail=head;
        while(curr!=null){
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        head=prev;
    }
    Node revListRe(Node curr){
        if(curr==null||curr.next==null){
            return curr;
        }
        Node newHead=revListRe(curr.next);
        curr.next.next=curr;
        curr.next=null;

        return newHead;
    }
    void revListRe(){
        tail=head;
        head=revListRe(tail);
    }

    void log() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sll ll = new sll();
        // ll.insertFront(10);
        // ll.insertBack(0);
        // ll.insertBack(20);
        // System.out.println(ll.size());
        // ll.insertFront(30);

        // System.out.println(ll.size());
        // ll.popFront();
        // ll.popBack();
        // ll.log();
        // System.out.println(ll.size());


        int arr[]={1,2,34,5,5,7,8,4,56,32};
        for(int i=0;i<arr.length;i++){
            ll.insertBack(arr[i]);
        }

        ll.revListRe();
        ll.log();
    }
}