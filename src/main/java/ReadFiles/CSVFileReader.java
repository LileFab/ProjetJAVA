package ReadFiles;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import org.apache.commons.csv.CSVRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.Reader;
import java.util.List;

public class CSVFileReader {
    private static final Logger logger = LogManager.getLogger(FileReader.class);
//gge
    public void checkHeader(File[] files) throws IOException {
        logger.info("Entré méthode checkHeader");
        for(File path : files)
        {
            Reader fileReader = new FileReader(path);
            CSVParser parser = new CSVParser(fileReader, CSVFormat.RFC4180);
            List<CSVRecord> csvRecords = parser.getRecords();
            logger.info("fin récup");
            System.out.println(csvRecords.get(0));
        }
    }
}
