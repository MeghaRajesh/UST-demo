

public class MyLinkedList {

    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public int insert(int element){
        Node newNode=new Node(element);
        if(this.head==null){
            this.head=newNode;
        }else{
            newNode.next=this.head;
            this.head=newNode;
        }
        return element;

    }

    public String print(){
        String output="";
        Node currentNode=this.head;
        while(currentNode != null){
            output=output + currentNode.data + "-->";
            currentNode=currentNode.next;
        }
        return output;
    }
    
}
