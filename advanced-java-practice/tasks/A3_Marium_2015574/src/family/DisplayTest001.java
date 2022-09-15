package Task1;

import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class DisplayTest001 {

	public static void main(String[] args) {
		DefaultMutableTreeNode root = FamilyTreeCreator.createFamilyTree();
		displayTree(root);
	}

	/**
	 * display the family tree as a hierarchy
	 * 
	 * @param root: the tree root node
	 */
	public static void displayTree(DefaultMutableTreeNode root) {
		// get the iterator to be able to iterate on all child nodes
		Iterator<TreeNode> it = root.children().asIterator();
		// print the current node with tabs according to its level in the tree (repeat
		// the tab as many as root.getLevel() number)
		System.out.println("\t".repeat(root.getLevel()).concat(root.getUserObject().toString()));
		// iterate over the children
		while (it.hasNext()) {
			// display one by one as it is the new root node for the remaining subtree
			displayTree((DefaultMutableTreeNode) it.next());
		}

	}
}
