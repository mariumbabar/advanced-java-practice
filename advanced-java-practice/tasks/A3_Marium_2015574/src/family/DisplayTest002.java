package Task1;

import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class DisplayTest002 {
	public static void main(String[] args) {
		DefaultMutableTreeNode root = FamilyTreeCreator.createFamilyTree();
		System.out.println("Pre-order display");
		preorderDisplay(root);

		System.out.println("\nIn-order display");

		inorderDisplay(root);
	}

	/**
	 * display the family tree in pre_order
	 * 
	 * @param root: the tree root node
	 */
	public static void preorderDisplay(DefaultMutableTreeNode root) {
		// get the iterator to be able to iterate on all child nodes
		Iterator<TreeNode> it = root.children().asIterator();
		// display the current root node
		System.out.println(root.getUserObject());
		// iterate over the children
		while (it.hasNext()) {
			// display one by one as it is the new root node for the remaining subtree
			preorderDisplay((DefaultMutableTreeNode) it.next());
		}
	}

	/**
	 * display the family tree in in_order
	 * <p>
	 * Note: DefaultMutableTreeNode structure does not define which nodes are in the
	 * left side or the right side of the parent node, so displaying a tree such as
	 * the given may not be complaint with the exact expected order
	 * </p>
	 * 
	 * @param root: the tree root node
	 */
	public static void inorderDisplay(DefaultMutableTreeNode root) {
		// get the iterator to be able to iterate on all child nodes
		Iterator<TreeNode> it = root.children().asIterator();

		// suppose that the first node is in the left, others are in the right
		if (it.hasNext()) {
			// display one by one as it is the new root node for the remaining subtree
			inorderDisplay((DefaultMutableTreeNode) it.next());

		}
		// display the parent node
		System.out.println(root.getUserObject());
		// iterate over right nodes of the parent ^
		while (it.hasNext()) {
			// display one by one as it is the new root node for the remaining subtree
			inorderDisplay((DefaultMutableTreeNode) it.next());
		}
	}
}
