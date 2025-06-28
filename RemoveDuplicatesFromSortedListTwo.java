import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicatesFromSortedListTwo {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.display();
        list.head = deleteDuplicates(list.head);
        list.display();
    }
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        if(temp == null){
            return head;
        }
        while(temp != null){
            if(map.containsKey(temp.val)){
                int val = map.get(temp.val);
                map.put(temp.val, val+1);
            }
            else{
                map.put(temp.val,1);
            }
            temp = temp.next;
        }
        ListNode newHead = new ListNode();
        ListNode output = newHead;
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        // System.out.println(Collections.sort(map.keySet()));
        for(Integer key : list){
            if(map.get(key)==1){
                ListNode t = new ListNode(key);
                newHead.next = t;
                newHead = newHead.next;
            }
        }
        return output.next;
    }
}
