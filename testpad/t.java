import java.util.Scanner;

class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
    }
    else
    {
      stackArray[++top] = j; // increment top, insert item
    }
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; // access item, decrement top
    }
  }
}

public class t {
    /* isEmpty(), isFull(), push(int) and int pop() functions available on Stack. */

    static int evalPostfix(CQStack s, String exp) {
    // Write your code here
      for(int i=0;i<exp.length();i++){
          char temp=exp.charAt(i);
          if(Character.isDigit(temp)){
              s.push(exp.charAt(i)-'0');
          }
          else{
              int second=s.pop();
              int first=s.pop();
              switch(temp){
                  case '+':
                      first+=second;
                      s.push(first);
                      break;
                  case '-':
                      first-=second;
                      s.push(first);
                      break;
                  case '*':
                      first*=second;
                      s.push(first);
                      break;
                  case '/':
                      first/=second;
                      s.push(first);
                      break;
                    case '^':
                      first=(int)Math.pow(first,second);
                      s.push(first);
                      break;
              }
          }
        }
        return s.pop();
    }
public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t;
    String st;
    t = Integer.parseInt(s.nextLine().trim());
    while(t>0)
    {
      st = s.nextLine().trim();
      System.out.println(evalPostfix(theStack, st));
      t--;
    }
    s.close();
  }
  }
