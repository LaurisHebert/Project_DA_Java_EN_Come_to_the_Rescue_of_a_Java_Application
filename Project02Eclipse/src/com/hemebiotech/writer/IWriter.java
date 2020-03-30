package com.hemebiotech.writer;

import java.util.Map;
/**
 * Receive the data collected by Collect and write they in a specific output
 *
 */
public interface IWriter {
    /**
     *
     * @param collectedMap contain a list of words and our occurrences
     * @throws WriterException
     */
    void write(Map<String, Long> collectedMap) throws WriterException;
}
