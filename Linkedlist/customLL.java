package Linkedlist;
public class customLL {
      public Node head;
    private Node tail;

    private int size ;

    public customLL() {
        this.size=0;
    }
    public void insertFirst(int val ){
      Node node = new Node(val);
      node.next=head;
      head=node;

      if(tail==null){ //there is only one node
          tail=head;
      }
        size++;
    }
    public void insertlast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAt(int position ,int val){
        if(position==0){
            insertFirst(val);
            return;
        }
        if(position==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
//         Node node=new Node(val,temp.next);
//         temp.next=node;

        temp.next= new Node(val, temp.next);
        size++;

    }
    public void insertrec(int val,int index){
        head=rec(val,index,head);
    }
    private Node rec(int val, int index, Node node){
        if(index==0){
          Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=rec(val,--index,node.next);
        return node;
    }
    public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.value+"->");
             temp=temp.next;
         }
        System.out.println("End");
    }
    public int RemoveFirst(){
        int val= head.value;
        if(size<=1){
            head=null;
            tail=null;
            return val;
        }
        head=head.next;
//        if(head==null){ // another way if only one element is present
//            tail=null;
//        }
        size--;
        return val;
    }
    public Node  find (int value ){
        Node node=head;

       while(node!=null){
           if(node.value==value){
               return node;
           }
          node=node.next;

       }
        return  null;

    }
   public Node  get(int index ){
        Node node=head;

        for(int i=1;i<index;i++){
            node=node.next;
        }
        return  node;

    }
    public int RemoveLast(){
        if(size<=1) {
          return  RemoveFirst();

        }
        int val= tail.value;
        Node node=get(size-1); //second last
        tail=node;
        node.next=null;
    size--;
return val;


    }
    public int delete(int index){
        if(index<=1){
            return RemoveFirst();
        }
        if(index==size){
            return RemoveLast();
        }
        Node prev=get(index-1);
        //System.out.println(prev.value);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    private static class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
