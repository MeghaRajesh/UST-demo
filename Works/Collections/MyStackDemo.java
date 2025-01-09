public class MyStackDemo {
    public static void main(String[] args) {
        MyStack myStack =new MyStack();
        myStack.pushItem(5);
        myStack.pushItem(6);
        myStack.pushItem(7);
        myStack.print();
        myStack.pushItem(8);
        myStack.pushItem(5);
        myStack.print();
        myStack.popItem();
        myStack.print();
        myStack.popItem();
        myStack.print();
        myStack.popItem();
        myStack.print();
        myStack.popItem();
        myStack.print();
        myStack.popItem();
        myStack.print();
    }
    
}
