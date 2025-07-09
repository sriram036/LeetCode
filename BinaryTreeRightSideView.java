import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeRightSideView {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(scanner);
        tree.display();
        System.out.println(rightSideView(tree.root));
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        // list.add(root.val);
        rightSideViewRec(root, list, 0);
        return list;
    }
    private static void rightSideViewRec(TreeNode root, List<Integer> list, int level){
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        }
        // System.out.println(root.val);
        rightSideViewRec(root.right, list, level+1);
        rightSideViewRec(root.left, list, level+1);
    }
    static class TreeNode {
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
        public void populate(Scanner scanner){
            System.out.println("Enter value for root node : ");
            int val = scanner.nextInt();
            root = new TreeNode(val);
            populate(scanner, root);
        }
        private void populate(Scanner scanner, TreeNode node){
            System.out.println("Want to Enter left of " + node.val);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of " + node.val + " Left");
                int leftVal = scanner.nextInt();
                node.left = new TreeNode(leftVal);
                populate(scanner, node.left);
            }

            System.out.println("Want to Enter right of " + node.val);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value of " + node.val + " Right");
                int rightVal = scanner.nextInt();
                node.right = new TreeNode(rightVal);
                populate(scanner, node.right);
            }
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
}
