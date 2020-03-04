package com.hemebiotech;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.collect.Collect;
import com.hemebiotech.collect.ICollect;
import com.hemebiotech.reading.ISymptomReader;
import com.hemebiotech.reading.ReadSymptomDataFromFile;
import com.hemebiotech.writer.ResultWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        ISymptomReader symptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        ICollect listCount = new Collect();
        ResultWriter write = new ResultWriter("Project02Eclipse/result.out");
        AnalyticsCounter start = new AnalyticsCounter(symptoms, listCount, write);
        start.run();
    }
}
