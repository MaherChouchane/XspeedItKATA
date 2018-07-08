package xspeedItKATA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author maher
 *
 */
public class BoxesOptimizer {

	/**
	 * default value of box capacity
	 */
	public static int boxCapacity = 10;

	/**
	 * To optimize boxes
	 * 
	 * @param boxCapacity
	 * @param articles
	 * @return list of optimized boxes
	 */
	public static List<String> optimizeBoxes(int boxCapacity, Integer... articles) {
		if (!isValid(articles))
			throw new IllegalArgumentException("Article size should be between 1 and 9.");
		BoxesOptimizer.boxCapacity = boxCapacity;
		List<Integer> chain = new ArrayList<>();
		chain.addAll(Arrays.asList(articles));
		List<String> result = new ArrayList<>();

		while (chain.size() != 0) {
			Integer first = chain.get(0);
			String r = findCombinaition(chain.subList(1, chain.size()), first.toString(), first);
			result.add(r);
			for (int i = 0; i < r.length(); i++) {
				int indexOfChar = chain.indexOf(Character.getNumericValue(r.charAt(i)));
				if (indexOfChar > -1)
					chain.remove(indexOfChar);
			}
		}
		return result;
	}

	/**
	 * @param articles
	 *            : list of articles
	 * @return boolean : check if articles is valid
	 */
	private static boolean isValid(Integer[] articles) {
		for (int article : articles)
			if (article > 9 || article < 1)
				return false;
		return true;
	}

	/**
	 * Recursively search of boxes
	 * 
	 * @param list
	 * @param currentCombination
	 * @param currentSum
	 * @return optimized box
	 */
	static String findCombinaition(List<Integer> list, String currentCombination, int currentSum) {
		int diff = boxCapacity - currentSum;

		if (list.contains(diff)) {
			return currentCombination + diff;
		} else if (list.isEmpty() || list.size() == 1)
			return currentCombination;
		else {
			int first = list.get(0);
			int sum = currentSum + first;
			if (sum < boxCapacity) {
				list.remove(0);
				currentCombination += first;
				return findCombinaition(list, currentCombination, sum);
			} else
				return findCombinaition(list.subList(1, list.size()), currentCombination, currentSum);
		}
	}
}
