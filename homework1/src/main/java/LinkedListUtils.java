import java.util.*;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {
	
	public static void insertSorted(LinkedList<Integer> list, int value) {

		/* IMPLEMENT THIS METHOD! */
		if (list != null){
			for (int i = 0; i <=list.size(); i++){
				if (list.isEmpty()){
					list.add(value);
					break;
				}
				if (value <= list.get(i)){
					list.add(i, value);
					break;
				}
				else if (value > list.getLast()){
					list.add(value);
					break;
				}
			}
		}
	}
	public static void removeMaximumValues(LinkedList<String> list, int N) {

		/* IMPLEMENT THIS METHOD! */
        if (list != null && N > 0 ){
        	if (list.size() == 1){
        		list.remove();
			}

        	if (list.size() > N){
				int i = 0;
				Collections.sort(list, Collections.reverseOrder());
        		while (i < N ) {
        			list.remove();
					i++;
				}
        	}
        }
	}
	
	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		/* IMPLEMENT THIS METHOD! */
		if (one != null && !one.isEmpty() && two != null && !two.isEmpty()) {
			/*for (int i = 0; i < two.size(); i++){
				if (one.subList(one.indexOf(two), two.getLast()).get(i) == two.getFirst()){
					return one.containsAll(two);
				}
			}*/
			
			return one.containsAll(two);
			//return Collections.indexOfSubList(one, two) != -1;
		}
		return false;
	}
}
