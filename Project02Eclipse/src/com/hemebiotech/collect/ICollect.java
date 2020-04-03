package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;

/**
 * Count the number of occurence in a list symptoms. The result may be sorted
 */

public interface ICollect {
	/**
	 *
	 * @param symptomsList => the list of symptom that may contains duplicate
	 * @return The collected count by symptom  that may be sorted
	 * @throws CollectException if an error occurs during the collect
	 */
	Map<String, Long> collectMap(List<String> symptomsList) throws CollectException;
}
