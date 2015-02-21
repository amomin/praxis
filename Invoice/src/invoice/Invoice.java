package invoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Invoice {

	/** Too lazy to add exception handling right now
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		ArrayList<InvoiceLine> invoice = new ArrayList<InvoiceLine>();
		InvoiceLine line = new InvoiceLine();
		int phase = 0;
		while(!input.equals("q")) {
			if (phase % 4 == 0) {
				System.out.println("Enter next item (type q to quit)");
				line = new InvoiceLine();
			}
			else if (phase % 4 == 1) {
				line.setName(input);
				System.out.println("Enter quantity (type q to quit)");				
			}
			else if (phase % 4 == 2) {
				line.setQuantity(Integer.parseInt(input));
				System.out.println("Enter price (type q to quit)");				
			}
			else if (phase % 4 == 3) {
				line.setPrice(Float.parseFloat(input));
				invoice.add(line);
				System.out.println("Type enter to begin next item, q to quit.");	
			}
			try {
				input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			phase++;
		}
		int lineNum = 0;
		float total = 0;
		for(InvoiceLine l : invoice) {
			lineNum++;
			total += l.total();
			System.out.printf("%-5d %s\n", lineNum, l.toString());
		}
		System.out.printf("%6s%-20s\n", "", "-----");
		System.out.printf("%6s%-20s %23s %.2f\n", "", "Total","",total);
		System.out.println("Done");
	}

}
