public class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public class tree {
        public static void main(String[] args) {
            node root = new node(10);
            root.left = new node(5);
            root.right = new node(20);
            root.left.left = new node(2);
            root.left.right = new node(7);

            System.out.println("tree created successfully!:");
            System.out.println();
            System.out.println("           " + root.data);
            System.out.println("        /  \\");
            System.out.println("       " + root.left.data + "    " + root.right.data);
            System.out.println("      / \\");
            System.out.println("     " + root.left.left.data + "   " + root.left.right.data);

        }
    }
}
