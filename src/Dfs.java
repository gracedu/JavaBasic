public class Dfs {
    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        if (root.left != null) preOrder((root.left));
        if (root.right != null) preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) inOrder(root.left);
        System.out.print(root.val);
        if (root.right != null) inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) postOrder(root.left);
        if (root.right != null) postOrder(root.right);
        System.out.print(root.val);
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
        System.out.println("preOrder:");
        dfsTest.preOrder(root);
        System.out.println();
        System.out.println("inOrder:");
        dfsTest.inOrder(root);
        System.out.println();
        System.out.println("postOrder:");
        dfsTest.postOrder(root);
    }
}
