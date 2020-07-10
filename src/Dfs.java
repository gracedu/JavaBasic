public class Dfs {
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
        } else {
            return;
        }
        if (root.left != null) preOrder((root.left));
        if (root.right != null) preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) preOrder((root.left));
        System.out.println(root.val);
        if (root.right != null) preOrder(root.right);
    }

    public void postOrder(TreeNode root) {

    }

    public static void  main(String[] args){
        Dfs dfsTest = new Dfs();
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(1);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(3);
        left.right = new TreeNode(2);
        right.right=new TreeNode(2);
        dfsTest.preOrder(root);
//        dfsTest.inOrder(root);
//        dfsTest.postOrder(root);
    }
}
