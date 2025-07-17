import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void display(){
        List<Integer> list = new ArrayList<>();
        display(root, list);
        System.out.println(list);
    }
    private void display(TreeNode node, List<Integer> list){
        if(node == null){
            // list.add(null);
            return;
        }
        list.add(node.val);
        display(node.left, list);
        display(node.right, list);
    }
}
