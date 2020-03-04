package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;

/**
 * Receive the data read by ISymptomReader, count and sort fot return a
 * collected data in Map
 */

public interface ICollect {
	/**
	 * @param symptomsList is the data read by ISymptomReader
	 */
	Map<String, Long> getMap(List<String> symptomsList) throws CollectException;
}
