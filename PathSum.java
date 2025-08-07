import java.util.Scanner;
public class PathSum{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s= new Scanner(System.in);
        tree.populate(s);
        tree.display();
        System.out.println("Enter The Target Sum : ");
        int targetSum = s.nextInt();
        System.out.println(hasPathSum(tree.root, targetSum));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return hasPath(root, targetSum, root.val);
    }
    public static boolean hasPath(TreeNode node, int targetSum, int sum){
        if(node != null && node.left == null && node.right == null){
            return sum==targetSum;
        }
        boolean left = false;
        boolean right = false;
        if(node.left != null){
            left = hasPath(node.left, targetSum, sum+node.left.val);
        }
        if(node.right != null){
            right = hasPath(node.right, targetSum, sum+node.right.val);
        }
        return left || right;
    }
}