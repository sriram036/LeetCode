import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class AddOneRowToTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println("Enter the val : ");
        int val = s.nextInt();
        System.out.println("Enter the depth : ");
        int depth = s.nextInt();
        tree.root = addOneRow(tree.root, val, depth);
        tree.display();
    }
    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;
        while(!queue.isEmpty()){
            int len = queue.size();
            // System.out.println(cur.val);
            count += 1;
            Queue<TreeNode> temp = new LinkedList<>();
            for(int i = 0; i < len; i++){
                TreeNode cur = queue.poll();
                temp.add(cur);
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
            if(count == depth){
                // System.out.println(queue);
                while(!temp.isEmpty()){
                    TreeNode curr = temp.poll();
                    if(curr.left == null){
                        TreeNode node = new TreeNode(val);
                        curr.left = node;
                    }
                    else if(curr.left != null){
                        TreeNode node = new TreeNode(val);
                        curr.left = node;
                        node.left = queue.poll();
                    }
                    if(curr.right == null){
                        TreeNode node = new TreeNode(val);
                        curr.right = node;
                    }
                    else if(curr.right != null){
                        TreeNode node = new TreeNode(val);
                        curr.right = node;
                        node.right = queue.poll();
                    }
                }
                return root;
            }
        }
        return root;
    }
}