package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Collect implements ICollect {

    /**
     * myMap is the collection which is returned (counted and sorted)
     */
	private Map<String, Long> myMap = new TreeMap<String, Long>();

	@Override
	public Map<String, Long> getMap(List<String> symptomsList) throws CollectException {
		try {
			for (String s : symptomsList) {
				myMap.put(s, myMap.getOrDefault(s, 0L) + 1);
			}
		} catch (Exception e) {
			throw new CollectException("Collect error", e);
		}
		return myMap;
	}
}
