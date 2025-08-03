import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class KthSmallestElementInBST{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        int k = 1;
        System.out.println(kthSmallest(tree.root, k));
    }
    public static int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        traverse(root,queue);
        for(int i = 0;i < k-1; i++){
            queue.poll();
        }
        return queue.poll().val;
    }
    public static void traverse(TreeNode node, Queue<TreeNode> queue){
        if(node==null){
            return;
        }
        traverse(node.left,queue);
        queue.add(node);
        traverse(node.right, queue);
    }
}