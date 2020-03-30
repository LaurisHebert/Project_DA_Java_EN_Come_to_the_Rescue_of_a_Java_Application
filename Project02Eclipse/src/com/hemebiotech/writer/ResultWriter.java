package com.hemebiotech.writer;

import java.io.FileWriter;
import java.util.Map;

public class ResultWriter implements IWriter {

    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file where symptom will be written
     *
     */
    public ResultWriter(String filepath) { this.filepath = filepath; }
    @Override
    public void write(Map<String, Long> collectedMap) throws WriterException {
        // try with resource
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Long> mapEntry : collectedMap.entrySet()) {
                writer.write(String.join("=", mapEntry.getKey(), mapEntry.getValue().toString()));
                writer.write("\n");
            }
        }
        catch (Exception e){
            throw new WriterException ( "Error to writing file \"" + filepath + "\"", e);
        }
    }
}
