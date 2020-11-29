import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Methods {

	// Displaying a duplicate which is not a duplicate in an array or un paired
	// element

	public Integer sample(int sampleArray[]) {

		if (sampleArray.length % 2 != 0) {
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int a : sampleArray) {
				// store arr in hash map
				if (!hm.containsKey(a)) {
					hm.put(a, 1);
				} else {
					hm.put((a), hm.get(a) + 1);
				}
			}
			// print key whose value is 1
			for (Entry<Integer, Integer> entry : hm.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println("this is the unpaired element " + entry.getKey());
				}

			}
		}

		return 0;
	}

	public void binaryGap(int a) {
		if (a == 1) {
           
        }
		
		
		// 1. convert decimal to binary
		//String abc = a;
		char ab [] = Integer.toBinaryString(a).toCharArray();  // converting string to char array
		
		int tempGap = 0;
		int finalGap =0;		
		// 2. iterarte over one by one 
		//1000100101
		for (int d=0;d<ab.length;d++) {
			
			if (ab[d]=='1') {
				tempGap++;
				continue;
			}
			else if (ab[d]=='0') {
				if (tempGap>finalGap) {
					finalGap=tempGap;
						tempGap=0;
				}
			}
		}
		
		System.out.println("This is a final gap " +finalGap);;
		
		
		
	}
	
}
