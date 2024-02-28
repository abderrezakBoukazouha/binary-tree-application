package Binary.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Application {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = BinaryTree.createBinaryTree();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        bt.traverseLevelOrder();
        System.out.println();
        bt.traversePreOrder(bt.root);

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));
        assertFalse(bt.containsNode(1));
    }
}
