
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.*; 
import javax.xml.crypto.NodeSetData;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Huffman {
	Node root = null;
	Node current = null;
	int count, m, n, h, k;
	boolean swapped = false;
	char c, check;
	char[] ch = new char[check];
	char[] character= new char[c];
	Node node = new Node();
	
	ArrayList<Integer> intArr = new ArrayList<Integer>();
	//PriorityQueue<Node> pq = new PriorityQueue<Node>();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	HashMap<Character, String> map = new HashMap<Character, String>();
	
	public Huffman(){
		
	}
	
	public void FrequTable(String in){
		
		int l=in.length();
		System.out.println("Frequency Table: " + in);
		for(c=32; c<127; c++){
			count=0;
			for(int i=0; i<l;i++){
				if(c==in.charAt(i)){
					count++;
					
				}
			}
			if(count>0){
				
				node.make(count, c);
				hm.put(node.c, node.freq);
				node.displayNode();
				System.out.println(c + ": " + count);
			}
		}
		System.out.println(hm);
	
	}
	
	private class MyComparator implements Comparator<Node>{
		public int compare(Node z, Node x){
			return z.freq - x.freq;
		}
	}
	
	public void tree(){
		PriorityQueue<Node> pq = new PriorityQueue<Node>(hm.size(), new MyComparator());
		for(int i=0; i<hm.size(); i++){
			Node huff = new Node();
			huff.c= node.c;
			huff.freq=node.freq;
			huff.leftChild=null;
			huff.rightChild=null;
			pq.add(huff);
			
		}
		Node root = null;
		while(pq.size()>1){
			Node z = pq.poll();
			Node x = pq.poll();
			Node y = new Node();
			y.freq = z.freq + x.freq;
			y.c=' ';
			y.leftChild = z;
			y.rightChild = x;
			root = y;
			pq.add(y);
			}
			code(root, "");
		
	}
			
	public void code(Node node, String code){
		if(node.leftChild==null && node.rightChild==null){
			map.put(node.c, code);
			System.out.println(map);
		}
		else{
		code(node.leftChild, code + "0");
		code(node.rightChild, code + "1");
		}

	}	
}

	//Attempt to print encoded string
	/*public void encoded(char[] c){
		for(int i = 0; i<c.length; i++){
		System.out.print(c[i]);
		}System.out.println();
	}*/
