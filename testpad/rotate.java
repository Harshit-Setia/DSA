import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
  LinkList(int d)
  {
    data=d;
  }
}

public class rotate
{
  // Insert in end
  static LinkList insertEnd(LinkList head, int data)
  {
    LinkList newLink = new LinkList(data);
    LinkList last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      newLink.prev = null;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    newLink.prev = last;
    return head;
  }

  static void traverse(LinkList first)
  {
    while (first != null)
    {
      System.out.print(first.data + " ");
      first = first.next;
    }
  }
static LinkList rotateByK(LinkList head, int k)
{    
    int n=0;
     LinkList temp=head;
    while(temp!=null){
        temp=temp.next;
        n++;
    }
    // System.out.println(n);
    if(n<=1||k==n)return head;
    k=(k%n);
    k=n-k;
    temp=head;
    LinkList kEle=null;
    while(temp.next!=null){
        if(++k==n){
            kEle=temp;
        }
        temp=temp.next;
        
    }
    temp.next=head;
    head.prev=temp;
    head=kEle.next;
    kEle.next=null;
    head.prev=null;
    return head;
}
public static void main(String[] args)
  {
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      LinkList head = null, t1;
      n=Integer.parseInt(s.nextLine().trim());
      while(n>0)
      {
        m=Integer.parseInt(s.nextLine().trim());
        head = insertEnd(head, m);
        n--;
      }
      x=Integer.parseInt(s.nextLine().trim());
      t1 = rotateByK(head, x);
      traverse(t1);
      System.out.println();
      t--;
    }
    s.close();
  }
}