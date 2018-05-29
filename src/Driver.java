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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Object;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		Huffman h = new Huffman();
		
		BufferedReader input = null;
		BufferedWriter output = null;
		input = new BufferedReader(new FileReader("input/input.txt"));
        output = new BufferedWriter(new FileWriter("output/output.txt"));
		String line = null;
		try{
			
			while((line=input.readLine())!=null){
                    System.out.println(line);
                    output.write(line);
                    h.FrequTable(line);
			}
			input.close();
			output.close();
		}
			catch(IOException x){
				System.err.format("IOException: %s%n", x);
		}
		h.tree();
	}
}
