package com.hemebiotech.writer;

import java.util.Map;
/**
 * Receive the data collected by Collect and write they in a specific output
 *
 */
public interface IWriter {
    void writer(Map<String, Long> myMap) throws WriterException;
}
