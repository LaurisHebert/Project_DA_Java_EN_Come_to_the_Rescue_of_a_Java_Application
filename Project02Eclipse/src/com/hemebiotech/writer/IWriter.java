package com.hemebiotech.writer;

import java.util.Map;
/**
 * Receive the data collected by Collect and write they in a specific output
 *
 */
public interface IWriter {
    /**
     *
     * @param collectedMap the count by symptom to write
     * @throws WriterException if an error occurs during the writing of the symptoms
     */
    void write(Map<String, Long> collectedMap) throws WriterException;
}
