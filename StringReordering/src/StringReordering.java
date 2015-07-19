import java.util.HashMap;


/** Solves using the bucket approach suggested in the solutions.
 * First instinct was to solve via the map-sort-unmap method
 * first suggested, but this is pretty nice.
 * 
 * @author amomin
 *
 */
public class StringReordering {

	private static HashMap<String, Integer> buckets;

	public static void main(String[] args) {
		buckets = new HashMap<String, Integer>();
		
		String dict = "ia mbn";
		
		String word = "Four score and seven years ago";
		
		for(int i = 0; i < dict.length(); i++) {
			char x = dict.charAt(i);
			buckets.put(String.valueOf(x), new Integer(0));
		}
		StringBuilder output = new StringBuilder("");
		
		for(int i = 0; i < word.length(); i++) {
			String c = String.valueOf(word.charAt(i));
			if (buckets.containsKey(c)) {
				Integer bucket = buckets.get(c);
				bucket++;
				buckets.put(c, bucket);
			} else {
				output.append(c);
			}
		}
		for(int i = 0; i < dict.length(); i++) {
			String c = String.valueOf(dict.charAt(i));
			Integer k = buckets.get(c);
			for (int j = 0; j < k; j++) {
				output.append(c);
			}
		}
		System.out.println(output);
	}
}
