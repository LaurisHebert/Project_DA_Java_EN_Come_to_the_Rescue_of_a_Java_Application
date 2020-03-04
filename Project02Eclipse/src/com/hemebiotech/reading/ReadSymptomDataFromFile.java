package com.hemebiotech.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }


    @Override
    /**
     * @param result who receive the data from the file
     * @return the content of each line of the filepath in an String value and add
     *         in the arraylist "result"
     * @throws IOException
     * @throws ReadSymptomException
     */
    public List<String> GetSymptoms() throws ReadSymptomException {
        ArrayList<String> result = new ArrayList<String>();
        try {
            if (filepath != null) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(filepath));
                    String line = reader.readLine();

                    while (line != null) {
                        result.add(line);
                        line = reader.readLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            throw new ReadSymptomException("File \"" + filepath + "\" doesn't exist", e);
        }
        return result;
    }

}
