/**
 * Created by Obaid on 1/21/2018.
 */
public class MerkleNode {

    private String hash;
    private MerkleNode leftChild;
    private MerkleNode rightChild;

    public MerkleNode(String hash, MerkleNode leftChild, MerkleNode rightChild) {
        this.hash = hash;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public MerkleNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MerkleNode leftChild) {
        this.leftChild = leftChild;
    }

    public MerkleNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MerkleNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        String toString = "MerkleNode{" +
                "hash='" + hash + '\'' +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';

        System.out.println(toString);
        return toString;
    }
}
