import java.util.Stack;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class treetraversal {
    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

public class BST {
    node root;
    // ================================INSETRT========================================

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private node insertRec(node current, int value) {
        if (current == null) {
            return new node(value);
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);
        } else if (value > current.data) {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    public void inorderIterative(node root) {
        if (root == null) {
            return;
        }
        Stack<node> stack = new Stack<>();
        node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public void preorderIterative(node root) {
        if (root == null) {
            return;
        }
        Stack<node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            node current = stack.pop();
            System.out.print(current.data + " ");
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public void postorderIterative(node root) {
        if (root == null) {
            return;
        }
        Stack<node> stack1 = new Stack<>();
        Stack<node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            node current = stack1.pop();
            stack2.push(current);
            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

}

class tree {
    public static void main(String[] args) {
        node root = new node(10);

        root.left = new node(5);
        root.right = new node(20);

        root.left.left = new node(2);
        root.left.right = new node(7);
        System.out.println("tree created successfully!:");
        System.out.println();
        System.out.println("         " + root.data);
        System.out.println("        /  \\");
        System.out.println("       " + root.left.data + "    " + root.right.data);
        System.out.println("      / \\");
        System.out.println("     " + root.left.left.data + "   " + root.left.right.data);

        System.out.println("Preorder traversal: ");
        treetraversal.preorder(root);
        System.out.println();
        System.out.println("Inorder traversal: ");
        treetraversal.inorder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        treetraversal.postorder(root);

    }
}
