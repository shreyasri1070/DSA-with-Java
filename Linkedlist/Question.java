package Linkedlist;



public class Question {
    Node head;
    Node tail;
    int size=0;

    public Question() {
        this.size=size;
    }

    //question-1
    public void insertrec(int val,int index){
        head=rec(val,index,head);
    }
    private Node rec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=rec(val,--index,node.next);
        return node;
    }

    //question-2 (Remove the duplicates-83)
    public void removedup(){
        Node node=head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
                size--;

            }
            else{
                node=node.next;

            }
        }
    }
    // questoin -3 (merger the sorted ll)
//    public static customLL merger(customLL list1,customLL list2){
//        customLL ans=new customLL();
//        Node f=list1.head;
//        Node s=list2.head;
//
//        while(f!=null&&s!=null){
//            if(f.val<s.val){
//                ans.insertlast(f.val);
//                f=f.next;
//            }else{
//                ans.insertlast(s.val);
//                s=s.next;
//            }
//
//        }
//        while(f!=null){
//            ans.insertlast(f.val);
//            f=f.next;
//        }
//        while(s!=null){
//            ans.insertlast(s.val);
//            s=s.next;
//        }
//
//        return  ans;
//
//    }

    // Question 4 (linked list cycle)

    public Boolean hasCycle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return false;
            }

        }


        return false;

    }
    // Question 4(a) (length of linked list cycle)

    public int lengthCycle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            int length=0;
            if(fast==slow){
              Node temp=slow;
              do{
                  temp=temp.next;
                  length++;
              }while(temp!=fast);
                return length;
            }
        }

        return 0;

    }

    // starting point of cycle
    public Node detectCycle(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node f=head;
                Node s=slow;
                while(f!=s){
                    f=f.next;
                    s=s.next;
                }
                return s;

            }
        }


        return null;


    }

    //200 happy number

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

       do{
           slow=square(slow);
           fast=square(square(fast));

       }while(slow!=fast);

       if(slow==1){
           return true;
       }
       return false;





    }
    private int square(int num){
        int ans=0;

        while(num<0){
            int sum=num%10;
            ans=sum*sum+ans;
            num=num/10;

        }
        return ans;
    }

    public Node middle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;


        }


        return slow;

    }


    // sort the linked list (Merge sort)
//    public Node sortlist(Node node){
//        if(head==null||head.next==null){
//            return head;
//        }
//
//        Node mid=middle();-
//        Node left=sortlist(head);
//        Node right=sortlist(mid);
//        return merge(left,right)
//    }


    // Reversal of linked-list

    private void reverse(Node node){

        if(node==tail){
            head=tail;
            return;

        }

        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }
    //inplace reversee of linkedlist

    public  void inplacerev(){
        if(size<2){
            return;
        }

        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
        return;

    }

    //Reverse the linkedlist from any point

    public  void rev(Node head,int left,int right){
        if(left==right){
            return;
        }
            int l=0;
        int r=0;


        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present!=null){

            if(l==left) {
                while(r==right-left+1)
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
                r++;

            }
            else{
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
                l++;

            }
        }
        head=prev;
        return;

    }
    //Pallindrom of linkedlist --243

//    public boolean isPalindrome(Node head) {
//
//        Node mid=middle();
//        Node SecondHead=inplacerev(mid);
//        while(head!=null&&SecondHead!=null){
//            if(head.val!=SecondHead.val){
//                return false;
//            }
//            head=head.next;
//            SecondHead=SecondHead.next;
//
//        }
//        return true;
//
//
//    }


    // rRotate list
//    public ListNode rotateRight(ListNode head, int k) {
//        if(head==null || head.next==null||k<0){
//            return head;
//        }
//        int l=1;
//        ListNode temp=head;
//
//        while(temp.next!=null){
//            l++;
//            temp=temp.next;
//        }
//        temp.next=head;
//        ListNode prev=null;
//        ListNode present=head;
//        for(int i=0;present!=null&&i<l-(k%l);i++){
//            prev=present;
//            present=present.next;
//
//        }
//
//
//
//        head=prev.next;
//        prev.next=null;
//
//        return head;
//
//    }





    private class Node{
        int val;
       Node next;

        public Node(int val) {
            this.val = val;
        }

        public  Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
