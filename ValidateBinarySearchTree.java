import java.util.Scanner;
public class ValidateBinarySearchTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(isValidBST(tree.root));
    }
    public static boolean isValidBST(TreeNode root) {
        return isValidBSTRecur(root,null,null);
    }
    public static boolean isValidBSTRecur(TreeNode node, Integer left, Integer right){
        if(node==null){
            return true;
        }
        if(left != null && left >= node.val){
            return false;
        }
        if(right != null && right <= node.val){
            return false;
        }
        boolean isLeftTrue = isValidBSTRecur(node.left, left, node.val);
        boolean isRightTrue = isValidBSTRecur(node.right,node.val, right);
        return isLeftTrue && isRightTrue;
    }
}