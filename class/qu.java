class Queue {
    int f;
    int r;
    int size = 10;
    int q[] = new int[size];

    Queue() {
        f = 0;
        r = -1;
    }

    void insert(int val) {
        if (!isFull()) {
            q[++r] = val;
        } else {
            System.out.println("Queue Overflow");
        }
    }

    int  pop() {

        if (f <= r) {
            int ans=q[0];
            for(int i=f;i<r;i++){
                q[i]=q[i+1];
            }
            r--;
            return ans;
        } else {
            System.out.println("Queue is empty");
        }
        return -1;
    }

    boolean isFull() {
        if (r == size - 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (f > r) {
            return true;
        }
        return false;
    }

    void display() {
        if (f > r)
            System.out.println("Queue is empty");
        else {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}

public class qu {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        q1.insert(6);
        q1.insert(7);
        q1.insert(8);
        q1.insert(9);
        q1.insert(10);
        q1.display();
        q1.insert(0);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        q1.insert(0);
        q1.display();
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        q1.display();

    }
}
