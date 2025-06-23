public class RemoveNthNodeFromEndOfList{
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.display();
        list.head = removeNthFromEnd(list.head, 2);
        list.display();
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int counter = 0;
        while(temp != null){
            temp = temp.next;
            counter++;
        }
        temp = head;
        if(counter==1 && n == 1){
            return null;
        }
        for(int i = 0; i < counter-n-1; i++){
            temp = temp.next;
        }
        // System.out.println(temp.val);
        if(counter-n==0){
            head = head.next;
            return head;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        else{
            temp.next = null;
        }
        return head;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode head;

    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public void addLast(int num){
        ListNode node = new ListNode(num);
        if(head==null){
            head = node;
        }
        else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void display(){
        ListNode temp= head;
        while(temp != null){
            if(temp.next != null){
                System.out.print(temp.val + "->");
            }
            else{
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
        System.out.println();
    }
}