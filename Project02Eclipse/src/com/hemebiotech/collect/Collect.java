package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Collect implements ICollect {

	@Override
	/**
	 *
	 * @param collectedMap who receive the data from a list of string
	 * @return the list of string sorted by alphabetical in a Map
	 * @throws CollectException
	 */
	public Map<String, Long> collectMap(List<String> symptomsList) throws CollectException {
		Map<String, Long> collectedMap = new TreeMap<String, Long>();
		try {
			for (String s : symptomsList) {
				collectedMap.put(s, collectedMap.getOrDefault(s, 0L) + 1);
			}
		} catch (Exception e) {
			throw new CollectException("Collect error", e);
		}
		return collectedMap;
	}
}
