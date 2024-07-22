package Linkedlist;



public class DoublyLL {
 private Node head;
 private Node tail;

 public void InsertFirst(int val){
     Node node=new Node(val);
     node.next=head;
     node.prev=null;
     if(head !=null){
         head.prev=node;
     }
     head=node;
 }

 public void display(){
     Node temp=head;
     Node last=null;
     while(temp!=null){
         System.out.print(temp.value+" -> ");
         last =temp;
         temp=temp.next;

     }


     System.out.println("End");
     System.out.println("Print in reverse");
     while(last!=null){
         System.out.print(last.value+" -> ");
         last=last.prev;

     }
     System.out.println("start");
 }


    public void InsertLast(int val){
        Node node=new Node(val);
       Node last=head;
       if(head==null){ // if ll is empty
           node.next=null;
           node.prev=null;
         head=node;
           return;
       }
        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
        node.next=null;

    }
    public Node get(int index){
         Node node=head;

        for(int i=1;i<index-1;i++){
            node=node.next;
        }
        return  node;

    }
    public void InsertAt(int index,int value){
        Node node=new Node(value);
        Node prev=get(index);
        if (index <=1) {
            InsertFirst(value);
            return;

        }
        if(prev==null||prev.next==null){
            InsertLast(value)
            ;
            return;
        }
        node.next=prev.next;
        prev.next=node;
        node.prev=prev;
        node.next.prev=node;


    }

 private static class Node{
     private int value;
     private Node next;
     private Node prev;

     public Node(int value) {
         this.value = value;
     }

     public Node(int value, Node next, Node prev) {
         this.value = value;
         this.next = next;
         this.prev = prev;
     }
 }
}
