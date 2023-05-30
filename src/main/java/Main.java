import ReadFiles.CSVFileReader;
import ReadFiles.FindFiles;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FindFiles findFiles = new FindFiles();
        CSVFileReader reader = new CSVFileReader();
        File[] files = findFiles.FileFilter();
        reader.checkHeader(files);
        //test jeremy
    }
}