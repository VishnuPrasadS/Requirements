package com.example.req.tree;

/**
 * Sorted Tree
 * @author me
 *
 */
public class SortedTree {

	TreeNode root;
	
	public void add(int data){
		TreeNode item = new TreeNode(data, null, null);
		addInternal(item);
	}
	
	private void addInternal(TreeNode item) {
		if(root == null) {
			root = item;
		} else {
			TreeNode traverse = root;
			TreeNode positionNode = null;
			while(traverse != null) {
				positionNode = traverse;
				if(item.data < traverse.data){
					traverse = traverse.left;
				} else {
					traverse = traverse.right;
				}
			}
			if(item.data < positionNode.data) {
				positionNode.left = item;
			} else {
				positionNode.right = item;
			}
		}
	}

	private void inOrderTravesal(TreeNode node, StringBuilder sb){
		if(node == null) {
			return;
		} else {
			inOrderTravesal(node.left, sb);
			sb.append(node.data + " ");
			inOrderTravesal(node.right, sb);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if( root == null) {
			sb.append("Sorted Tree is empty");
		}else {
			inOrderTravesal(root, sb);
		}
		return sb.toString();
	}
	
	
}
