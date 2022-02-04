package incrementer.service.impl;

import incrementer.service.FileDataReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDataReaderImpl implements FileDataReader {

    @Override
    public int readFile(String location) {
        Path path = Paths.get(location);
        try {
            String read = Files.readAllLines(path).get(0);
            return Integer.parseInt(read);
        } catch (IOException e) {
            return -1;
        }
    }
}
