package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;

/**
 *
 * Receive a list of strings from ISymptomReader to count and sort them alphabetically
 */

public interface ICollect {
	/**
	 *
	 * @param symptomsList contain a list of string who need to be sorted
	 * @return the sorted list in map
	 * @throws CollectException
	 */
	Map<String, Long> collectMap(List<String> symptomsList) throws CollectException;
}
