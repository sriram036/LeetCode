import java.util.Scanner;
public class LowestCommonAncestorOfBinaryTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(lowestCommonAncestor(tree.root,tree.root.left, tree.root.right).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p|| root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if((left == p && right == q) || (left==q && right == p)){
            return root;
        }

        return left == null ? right : left;
    }
}