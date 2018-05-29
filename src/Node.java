/*
 * Alicé Lesowski
 * May 29, 2018
 * CSCI 232
 * This code is supposed to represent a huffman algorithm that takes in an input 
 * file and counts the frequency of each letter, encodes the characters by their frequency
 * with their own binary code into a binary tree and prints the encoded message to an output file.
 *
 * Attempted to print code for each character but was only able to get the character w to print for each code
 * Because of this, attemps to encode and decode weren't successful
 */

public class Node {
	//int frequency;
	//int count;
	//char letter; //character from input.txt
	public String code;
	public int freq;           // data item (key)
	public char c;        // data item
	public Node leftChild;      // this Node's left child
	public Node rightChild; // this Node's right child
	public Node parent;
	Node root;
	
	public Node(){
	}

	public void displayNode() {
		System.out.print('{');
		System.out.print(freq);
		System.out.print(", ");
		System.out.print(c);
		System.out.print("} ");	
	}
	
	public void make(int iCount, char c){
		this.freq=iCount;
		this.c=c;
		leftChild=null;
		rightChild=null;
		parent= null;
	}
	public Node getLeft(){
		return leftChild;
	}
	
	public Node getRight(){
		return rightChild;
	}
	
	public void setStr(Node node, String code){
		node.code = code;
	}
	
	public char getChar(Node node){
		return node.c;
	}
}
