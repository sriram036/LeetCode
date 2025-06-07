public class MainLinkedList{
    public static void main(String[] args){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(6);
        list1.addLast(11);

        list2.addLast(2);
        list2.addLast(6);
        list2.addLast(7);

        ListNode res = mergeTwoLists(list1.head, list2.head);

        while(res != null){
            System.out.print(res.val+ " ");
            res = res.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode node = new ListNode();
        head = node;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                node.next = list1;
                list1 = list1.next;
            }
            else{
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        while(list1 != null){
            node.next = list1;
            node = node.next;
            list1 = list1.next;
        }
        while(list2 != null){
            node.next = list2;
            node = node.next;
            list2 = list2.next;
        }
        return head.next;
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
    public void addAtIndexRec(int val, int index){
        head = addAtIndexRec(val, index, head);
    }
    public ListNode addAtIndexRec(int val, int index, ListNode node){
        if(index==0){
            ListNode newNode = new ListNode(val, node);
            return newNode;
        }
        node.next = addAtIndexRec(val, --index, node.next);
        return node;
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