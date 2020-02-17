package com.example.req.tree;

/**
 * Data structure to hold a tree node
 * @author me
 *
 */
public class TreeNode {

	int data;
	TreeNode left, right;
	
	public TreeNode(int data, TreeNode left, TreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
