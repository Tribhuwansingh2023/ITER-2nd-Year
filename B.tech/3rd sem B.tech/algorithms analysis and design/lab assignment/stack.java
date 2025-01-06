public class stack{
    int top=-1;
    int size=0;
    public static int stackArray[]=new int[10];
    public void push(int n){
        if(size>=10){
            System.out.println("stack overflow");
        }
        else{
            top++;

            stackArray[top]=n;
            size++;

        }

    }
    public void pop(){
        if (size==0){
        System.out.println("stack underflow");
        }
        else{
            System.out.println(stackArray[top]+"is deleted");
            top--;
            size--;

        }
    }
    public void display(){
        if (size==0){
        System.out.println("stack is empty");
        }
        else{for(int i=size-1;i>=0;i--){
            System.out.println(stackArray[i]);
        }}
        }
    public static void main(String[] args) {
       stack stk=new stack();
       stk.push(10);
       stk.push(20);
       stk.push(27);
       stk.pop();
        stk.display();
             }
            
            
        }

