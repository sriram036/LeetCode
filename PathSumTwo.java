import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class PathSumTwo{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s = new Scanner(System.in);
        tree.populate(s);
        tree.display();
        System.out.println("Enter Target Sum : ");
        int targetSum = s.nextInt();
        List<List<Integer>> lists = pathSum(tree.root, targetSum);
        System.out.println(lists);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return lists;
        }
        list.add(root.val);
        pathSumRecur(root, targetSum, lists, list, root.val);
        return lists;
    }
    public static void pathSumRecur(TreeNode node, int targetSum, List<List<Integer>> lists, List<Integer> list, int sum){
        if(node != null && node.left == null && node.right == null){
            if(sum==targetSum){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        if(node.left != null){
            list.add(node.left.val);
            pathSumRecur(node.left, targetSum, lists, list, sum+node.left.val);
            list.remove(list.size()-1);
        }
        if(node.right != null){
            list.add(node.right.val);
            pathSumRecur(node.right, targetSum, lists, list, sum+node.right.val);
            list.remove(list.size()-1);
        }
    }
}