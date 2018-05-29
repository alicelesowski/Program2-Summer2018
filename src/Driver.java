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
