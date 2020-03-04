package com.hemebiotech.analytics;


import com.hemebiotech.collect.CollectException;
import com.hemebiotech.collect.ICollect;
import com.hemebiotech.reading.ISymptomReader;
import com.hemebiotech.reading.ReadSymptomException;
import com.hemebiotech.writer.IWriter;
import com.hemebiotech.writer.WriterException;

public class AnalyticsCounter {

    private ISymptomReader symptoms;
    private ICollect collect;
    private IWriter writer;

    public AnalyticsCounter (ISymptomReader symptoms, ICollect collect, IWriter writer) {this.symptoms = symptoms; this.collect = collect; this.writer = writer;}

    public void run () throws WriterException, CollectException, ReadSymptomException {
        writer.writer(collect.getMap(symptoms.GetSymptoms()));
    }

}
