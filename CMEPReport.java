package CMEPReport;

import org.apache.commons.csv.CSVFormat; 
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class CMEPReport {
    //private static final String SAMPLE_CSV_FILE_PATH = "./CMEPIntervalReadRpt.201806260230_20180626111020_0001.csv";

    public static void main(String SAMPLE_CSV_FILE_PATH) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);        
        ) {
                int             IMDs = 0,
                                GKWHREGIMDs = 0,
                                KWHREGIMDs = 0,
                                KVARHREGIMDs = 0,
                                CCFREGIMDs = 0,
                                CCFCREGIMDs = 0,
                                GKWHIMDs = 0,
                                KWHIMDs = 0,
                                KVARHIMDs = 0,
                                CCFIMDs = 0,
                                CCFCIMDs = 0,
                                SKWHIMDs = 0
                                ;
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String PO0 = csvRecord.get(0);
                String PO1 = csvRecord.get(1);
                String PO2 = csvRecord.get(2);
                String PO3 = csvRecord.get(3);
                String PO4 = csvRecord.get(4);
                String MeterID = csvRecord.get(5);
                String PO6 = csvRecord.get(6);
                String PO7 = csvRecord.get(7);
                String PO8 = csvRecord.get(8);
                String PO9 = csvRecord.get(9);
                String UOM = csvRecord.get(10);
                String PO11 = csvRecord.get(11);
                String PO12 = csvRecord.get(12);
                String NumberOfIntervals = csvRecord.get(13);
                /*
                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("RecordType : " + PO0);
                System.out.println("RecordVersion : " + PO1);
                System.out.println("SenderID : " + PO2);
                System.out.println("SenderCustomerID : " + PO3);
                System.out.println("TimeStamp : " + PO4);
                System.out.println("MeterID : " + MeterID);
                System.out.println("PO6 : " + PO6);
                System.out.println("PO7 : " + PO7);
                System.out.println("PO8 : " + PO8);
                System.out.println("PO9 : " + PO9);
                System.out.println("UOM : " + UOM);
                System.out.println("PO11 : " + PO11);
                System.out.println("PO12 : " + PO12);
                System.out.println("NumberOfIntervals : " +NumberOfIntervals);
                System.out.println("---------------\n\n");
                */                           
                if (UOM.equals("GKWHREG")) {
                                GKWHREGIMDs = GKWHREGIMDs+2;
               //     System.out.println("GKWHREG IMDs : " + GKWHREGIMDs);
                } else if (UOM.equals("KWHREG")) {
                                KWHREGIMDs = KWHREGIMDs+2;
               //             System.out.println("KWHREG IMDs : " + KWHREGIMDs);
                } else if (UOM.equals("KVARHREG")) {
                                KVARHREGIMDs = KVARHREGIMDs+2;
               //             System.out.println("GKWHREG IMDs : " + GKWHREGIMDs);
                }  else if (UOM.equals("CCF REG")) {
                                CCFREGIMDs = CCFREGIMDs+2;
               //             System.out.println("CCFREG IMDs : " + CCFREGIMDs);
                }  else if (UOM.equals("CCF-CREG")) {
                                CCFCREGIMDs = CCFCREGIMDs+2;
               //             System.out.println("CCF-CREG IMDs : " + CCFCREGIMDs);
                }  else if (UOM.equals("GKWH")) {
                                GKWHIMDs = GKWHIMDs+1;
              //             System.out.println("GKWH IMDs : " + GKWHIMDs);
                }  else if (UOM.equals("KWH")) {
                                KWHIMDs = KWHIMDs+1;
               //             System.out.println("KWH IMDs : " + KWHIMDs);
                }  else if (UOM.equals("KVARH")) {
                                KVARHIMDs = KVARHIMDs+1;
               //             System.out.println("KVARH IMDs : " + KVARHIMDs);
                }  else if (UOM.equals("CCF")) {
                                CCFIMDs = CCFIMDs+1;
               //             System.out.println("CCF IMDs : " + CCFIMDs);
                }  else if (UOM.equals("CCF-C")) {
                                CCFCIMDs = CCFCIMDs+1;
               //             System.out.println("CCF-C IMDs : " + CCFCIMDs);
                }  else if (UOM.equals("SKWH")) {
                                SKWHIMDs = SKWHIMDs+1;
               //             System.out.println("SKWH IMDs : " + SKWHIMDs);
                }
         /*
                System.out.println("Total IMDs : "+IMDs);
                System.out.println("\nGKWHREG IMDs : "+GKWHREGIMDs);
                System.out.println("\nKWHREG IMDs : "+KWHREGIMDs);
                System.out.println("\nKVARHREG IMDs : "+KVARHREGIMDs);
                System.out.println("\nCCFREG IMDs : "+CCFREGIMDs);
                System.out.println("\nCCF-CREG IMDs : "+CCFCREGIMDs);
                System.out.println("\nGKWH IMDs : "+GKWHIMDs);
                System.out.println("\nKWH IMDs : "+KWHIMDs);
                System.out.println("\nKVARH IMDs : "+KVARHIMDs);                
                System.out.println("\nCCF IMDs : "+CCFIMDs);
                System.out.println("\nCCF-C IMDs : "+CCFCIMDs);
                System.out.println("\nSKWH IMDs : "+SKWHIMDs);
                                */              
            }
            System.out.println("Total IMDs : "+(GKWHREGIMDs+KWHREGIMDs+KVARHREGIMDs+CCFREGIMDs+CCFCREGIMDs+GKWHIMDs+KWHIMDs+KVARHIMDs+CCFIMDs+CCFCIMDs+SKWHIMDs));
            System.out.println("\nGKWHREG IMDs : "+GKWHREGIMDs);
            System.out.println("KWHREG IMDs : "+KWHREGIMDs);
            System.out.println("KVARHREG IMDs : "+KVARHREGIMDs);
            System.out.println("CCFREG IMDs : "+CCFREGIMDs);
            System.out.println("CCF-CREG IMDs : "+CCFCREGIMDs);
            System.out.println("GKWH IMDs : "+GKWHIMDs);
            System.out.println("KWH IMDs : "+KWHIMDs);
            System.out.println("KVARH IMDs : "+KVARHIMDs);                
            System.out.println("CCF IMDs : "+CCFIMDs);
            System.out.println("CCF-C IMDs : "+CCFCIMDs);
            System.out.println("SKWH IMDs : "+SKWHIMDs);

         
            }           
            }
}
