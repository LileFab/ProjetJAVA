package ReadFiles;

import org.apache.commons.io.filefilter.RegexFileFilter;
import java.io.File;
import java.io.FileFilter;

public class FindFiles {
    public File[] FileFilter() {
        File dir = new File("data");
        FileFilter fileFilter = new RegexFileFilter("^users_[0-9]{12}.csv$");
        File[] files = dir.listFiles(fileFilter);
        System.out.println("Nombre de fichiers corrects : " + files.length);
        return files;
    }
}
