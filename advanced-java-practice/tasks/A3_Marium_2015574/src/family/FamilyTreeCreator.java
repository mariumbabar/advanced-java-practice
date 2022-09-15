package Task1;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * helper class to create the given family tree
 * 
 * @author marium
 *
 */
public class FamilyTreeCreator {

	/**
	 * create a tree node given the parameters of the family object
	 * 
	 * @param forename
	 * @param surname
	 * @param parent
	 * @param location
	 * @return
	 */
	public static DefaultMutableTreeNode createTreeNode(String forename, String surname, String parent,
			String location) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode();
		Family member = new Family(forename, surname, parent, location);
		node.setUserObject(member);
		return node;
	}
	

	public static DefaultMutableTreeNode createTreeNodewithForenameAndParent(String forename, String parent) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode();
		Family member = new Family();
		member.setForename(forename);
		member.setParent(parent);
		node.setUserObject(member);
		return node;
	}

	/**
	 * create the family tree given in the document
	 * 
	 * @return the root node of the tree
	 */
	public static DefaultMutableTreeNode createFamilyTree() {
		DefaultMutableTreeNode one = createTreeNode("Jonathan", "Davin", "Victor", "Dubai");
		DefaultMutableTreeNode two = createTreeNode("Sarah", "Fedora", "Samson", "Sharjah");
		DefaultMutableTreeNode three = createTreeNode("Steffi", "Rebecca", "Samson", "Sharjah");
		DefaultMutableTreeNode four = createTreeNode("Solomon", "Peter", "Fedora", "RAK");
		DefaultMutableTreeNode five = createTreeNode("Sanjay", "Ann", "Rebecca", "Sharjah");
		DefaultMutableTreeNode six = createTreeNode("Aldrine", "Rose", "Rebecca", "Sharjah");
		DefaultMutableTreeNode seven = createTreeNode("George", "Graham", "Fedora", "RAK");
		DefaultMutableTreeNode eight = createTreeNode("Johnson", "Simon", "Samson", "Dubai");
		DefaultMutableTreeNode nine = createTreeNode("Linfred", "Caleb", "Ann", "Dubai");
		DefaultMutableTreeNode ten = createTreeNode("Johan", "Holmes", "Ann", "RAK");
		DefaultMutableTreeNode eleven = createTreeNode("Christa", "Larissa", "Graham", "Dubai");

		one.add(two);
		one.add(three);

		two.add(four);
		two.add(five);

		three.add(six);
		three.add(seven);

		four.add(eight);

		five.add(nine);
		five.add(ten);

		seven.add(eleven);

		return one;
	}

}
