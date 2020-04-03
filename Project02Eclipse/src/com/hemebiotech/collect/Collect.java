package com.hemebiotech.collect;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Collect implements ICollect {

	@Override
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
