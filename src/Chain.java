import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Obaid on 1/6/2018.
 */
public class Chain {

    public Chain() {
        this.blocks = new ArrayList<Block>();
        this.genesis = new Block("0","I am the genesis block");

        this.blocks.add(this.genesis);
    }

    private Block genesis;
    private ArrayList<Block> blocks;

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    private void addBlock(String payload) {

        Block previousBlock = this.getBlocks().get(this.getBlocks().size()-1);
        String previousHash = previousBlock.getPreviousHash();

        Block block = new Block(previousHash, payload);

//        System.out.print("Previous block: "); previousBlock.printHash();
//        System.out.print("Current block: ");block.printHash();

        this.getBlocks().add(block);
    }

    public void addBlock(Block block) {
        Block lastBlock = this.getBlocks().get(this.getBlocks().size()-1);

        if (block.getPreviousHash().equals(lastBlock.getHash())) {
            this.getBlocks().add(block);
        }
    }


    public static void main (String [] args) {

        Chain chain = new Chain();
        System.out.print("Genesis block: "); chain.getGenesis().printHash();

        //now add two more blocks in the chain
        chain.addBlock("This is the second block");
        chain.addBlock("This is the third block");
        chain.addBlock("This is the fourth block");

        //Change the payload of any the blocks and watch the hash of the next one change
    }

    public Block getGenesis() {
        return genesis;
    }
}
