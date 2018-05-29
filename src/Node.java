

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