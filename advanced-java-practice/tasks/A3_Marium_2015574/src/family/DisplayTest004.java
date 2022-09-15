package Task1;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JFrame;

public class DisplayTest004 extends JFrame {
	private JTree tree;

	public DisplayTest004() {
//create the root node
		DefaultMutableTreeNode root = FamilyTreeCreator.createFamilyTree();
		tree = new JTree(root);
		add(tree);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("DisplayTest004");
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DisplayTest004();
			}
		});
	}
}