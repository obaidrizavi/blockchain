import java.util.Stack;

/**
 * Created by Obaid on 1/21/2018.
 */
public class MerkleTree {

    public MerkleNode createMerkleTree() {

        MerkleNode treeRoot;

        MerkleNode a = new MerkleNode(String.valueOf("a".hashCode()),null,null);
        MerkleNode b = new MerkleNode(String.valueOf("b".hashCode()),null,null);
        MerkleNode c = new MerkleNode(String.valueOf("c".hashCode()),null,null);
        MerkleNode d = new MerkleNode(String.valueOf("d".hashCode()),null,null);

        MerkleNode ab = new MerkleNode(
                String.valueOf(a.getHash()+b.getHash().hashCode()),
                a,b
        );

        MerkleNode cd = new MerkleNode(
                String.valueOf(c.getHash()+d.getHash().hashCode()),
                c,d
        );

        treeRoot = new MerkleNode(
                String.valueOf(ab.getHash()+cd.getHash().hashCode()),
                ab,cd
        );

//        a.toString();
//        b.toString();
//        c.toString();
//        d.toString();
//        ab.toString();
//        cd.toString();
//        treeRoot.toString();

        return treeRoot;
    }

    public static void main (String args[]) {
        MerkleTree tree = new MerkleTree();
        MerkleNode root = tree.createMerkleTree();
        tree.traverseTree(root);
    }

    public void traverseTree (MerkleNode treeRoot) {
        System.out.println("I am on node: " + treeRoot.getHash());
        if (null != treeRoot.getLeftChild()) {
            traverseTree(treeRoot.getLeftChild());
        }
        if (null != treeRoot.getRightChild()) {
            traverseTree(treeRoot.getRightChild());
        }
        return;
    }

    public boolean hasChildren(MerkleNode node) {
        return (null != node.getLeftChild() || null != node.getRightChild());
    }
}
