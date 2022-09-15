package Task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class DisplayTest003 {
	public static void main(String[] args) {
		DefaultMutableTreeNode root = FamilyTreeCreator.createFamilyTree();
		String parentForename = "Aldrine";
		String parentSurname = "Rose";
		DefaultMutableTreeNode nodeJoel = FamilyTreeCreator.createTreeNodewithForenameAndParent("Joel", parentSurname);
		DefaultMutableTreeNode nodeCheryl = FamilyTreeCreator.createTreeNodewithForenameAndParent("Cheryl",
				parentSurname);
		List<DefaultMutableTreeNode> children = Arrays.asList(nodeJoel, nodeCheryl);
		addChildrenAt(root, parentForename, children);
		System.out.println("a.Dispaly the family tree after adding the two children:");
		displayTree(root);
		System.out.println("\nb.Display all family member details from the family tree who lives in Sharjah and children of “Davin”");
		searchByLocation(root, "Sharjah");
	}

	/**
	 * add children to a node that match the given forename
	 * 
	 * @param tree           the root of the family tree
	 * @param parentForename the forename of the node to add the children to it
	 * @param children       the children to add add to the aprent node
	 */
	private static void addChildrenAt(DefaultMutableTreeNode tree, String parentForename,
			List<DefaultMutableTreeNode> children) {
		Family member = (Family) tree.getUserObject();
		if (member.getForename().equals(parentForename)) {
			children.forEach(tree::add);
			return;
		}
		// get the iterator to be able to iterate on all child nodes
		Iterator<TreeNode> it = tree.children().asIterator();
		// iterate over the children
		while (it.hasNext()) {
			addChildrenAt((DefaultMutableTreeNode) it.next(), parentForename, children);
		}
	}
	
	public static void searchByLocation(DefaultMutableTreeNode root, String location) {
		Family member = (Family) root.getUserObject();
		if(member.getLocation().equals(location)) {
			System.out.println(member);
		}
		// get the iterator to be able to iterate on all child nodes
		Iterator<TreeNode> it = root.children().asIterator();
		// iterate over the children
		while (it.hasNext()) {
			searchByLocation((DefaultMutableTreeNode) it.next(), location);
		}
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
