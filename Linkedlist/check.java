package Linkedlist;


public class check {
    ListNode head;
    public void insertrec(int val,int index){
        head=rec(val,index,head);
    }
    private ListNode rec(int val, int index, ListNode node){
        if(index==0){
          ListNode temp=new ListNode(val,node);

            return temp;
        }
        node.next=rec(val,--index,node.next);
        return node;
    }
    public void display(){
     ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        check li=new check();
        li.insertrec(2,0);
        li.insertrec(5,1);
        li.insertrec(3,2);
        li.insertrec(1,3);
        li.display();
        sortList(li.head);
      

    }
    public  static ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }



       ListNode mid=middle(head);
       ListNode left=head;
       ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);

        return merger(left,right);



    }

    public static ListNode middle(ListNode Head){
       ListNode slow=Head;
       ListNode fast= Head;

        while(fast!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;


        }
        return slow;

    }

    public static ListNode merger(ListNode List1,ListNode List2){

        if(List1==null){
            return List2;
        }
        if(List2==null){
            return List1;
        }

       ListNode ans= new ListNode();
       ListNode f=ans;
       ListNode l1=List1;
       ListNode l2=List2;

        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                f.next=l2;
                f=f.next;
                l2=l2.next;


            }
            else{
                f.next=l1;
                f=f.next;
                l1=l1.next;
            }

        }

        while(l1!=null){
            f.next=l1;
            f=f.next;
            l1=l1.next;

        }
        while(l2!=null){
            f.next=l2;
            f=f.next;
            l2=l2.next;


        }


        return ans.next;


    }



    public  static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
