import java.util.Scanner;
public class RecoverBinarySearchTree{
    static TreeNode swappedLeftNode;
    static TreeNode swappedRightNode;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        recoverTree(tree.root);
        tree.display();
    }
    public static void recoverTree(TreeNode root) {
        if(root==null){
            return;
        }
        recoverTreeRecur(root);
        // System.out.println(swappedLeftNode + " " + swappedRightNode);
        if(swappedLeftNode != null && swappedRightNode != null){
            int temp = swappedLeftNode.val;
            swappedLeftNode.val = swappedRightNode.val;
            swappedRightNode.val = temp;
            swappedLeftNode = null;
            swappedRightNode = null;
            return;
        }
        else if(swappedLeftNode != null && swappedRightNode == null){
            int temp = root.val;
            root.val = swappedLeftNode.val;
            swappedLeftNode.val = temp;
            swappedLeftNode = null;
            return;
        }
        else if(swappedLeftNode == null && swappedRightNode != null){
            int temp = root.val;
            root.val = swappedRightNode.val;
            swappedRightNode.val = temp;
            swappedRightNode = null;
            return;
        }
        recoverTree(root.left);
        recoverTree(root.right);
    }
    public static void recoverTreeRecur(TreeNode node){
        int root = node.val;
        recoverTreeRecur(root, node.left, true);
        recoverTreeRecur(root, node.right, false);
    }
    public static void recoverTreeRecur(int root, TreeNode node, boolean isLeft){
        if(node==null){
            return;
        }
        if(node != null && isLeft && node.val > root){
            if(swappedLeftNode == null){
                swappedLeftNode = node;
            }
            else if(swappedLeftNode != null && swappedLeftNode.val < node.val){
                swappedLeftNode = node;
            }
        }
        if(node != null && !isLeft && node.val < root){
            if(swappedRightNode == null){
                swappedRightNode = node;
            }
            else if(swappedRightNode != null && swappedRightNode.val > node.val){
                swappedRightNode = node;
            }
            
        }
        recoverTreeRecur(root, node.left, isLeft);
        recoverTreeRecur(root, node.right, isLeft);
    }
}